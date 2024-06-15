import data.TrxModel
import data.TrxType

/**
 * Transaction Class That Automatically Initialize Its Own Transaction List
 */
class Transaction{
    private val listTransaction: MutableList<TrxModel> = mutableListOf()

    /**
    *   Add Income To Transaction
    * */
    fun addIncome(name: String, amount: Double) {
        val trxData = TrxModel(name = name, amount = amount, type = TrxType.IN())
        listTransaction.add(trxData)
    }

    /**
     *   Add Expense To Transaction
     * */
    fun addExpense(name: String, amount: Double) {
        val trxData = TrxModel(name = name, amount = amount, type = TrxType.OUT())
        listTransaction.add(trxData)
    }


    /**
     * Show The Transaction History
     */
    fun showTransactionHistory() {
        if (listTransaction.isNotEmpty()) {
            listTransaction.forEachIndexed { index, trxModel ->
                showTransactionData(index+1, trxModel)
            }
            return
        }
        onDataEmpty()
    }

    /**
     * Show The Transaction Summary
     */
    fun showTransactionSummary() {
        if (listTransaction.isEmpty()) {
            onDataEmpty()
            return
        }
        val inBalance = listTransaction.filter {
            it.type is TrxType.IN
        }.sumOf {
            it.amount
        }

        val outBalance = listTransaction.filter {
            it.type is TrxType.OUT
        }.sumOf {
            it.amount
        }

        println("Income: $inBalance")
        println("Expense: $outBalance")
        println("Total Balance: ${getCurrentBalance()}")
        println(suggestionBasedIncomeAndExpense(inBalance, outBalance))
    }

    /**
     *   Return The Current Balance or Summary of The Transaction
     * */
    private fun getCurrentBalance(): Double {
        var totalBalance = 0.0
        if (listTransaction.isNotEmpty()) {
            listTransaction.forEach {
                when (it.type) {
                    is TrxType.IN -> {
                        totalBalance += it.amount
                    }
                    is TrxType.OUT -> {
                        totalBalance -= it.amount
                    }
                }
            }
            return totalBalance
        }
        return totalBalance
    }

    private fun suggestionBasedIncomeAndExpense(inBalance: Double, outBalance: Double): String {
        val incomeGrtExpense = "Keep Going!! Your balance is in surplus condition"
        val expenseGrtIncome = "Better Saving!! Your balance is in minus condition"

        return if(inBalance > outBalance) incomeGrtExpense else expenseGrtIncome
    }

    private fun onDataEmpty() {
        println("There's no data right now")
    }

    private fun showTransactionData(number: Int, data: TrxModel) {
        println("[$number]. ${data.type.name}, ${data.name}, Rp ${data.amount}-,")
    }

}