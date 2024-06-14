import data.TrxModel

fun main() {
    val transaction = Transaction()
    var inputData: Pair<String?, Double?>

    while (true) {
        val menu = menu()
        menu?.let {
            when(it) {
                1 -> {
                    inputData = receiveTrxData()
                    if (inputData.first != null && inputData.second != null) {
                        transaction.addIncome(inputData.first!!, inputData.second!!)
                    } else {
                        println("Error Input")
                    }
                }
                2 -> {
                    inputData = receiveTrxData()
                    if (inputData.first != null && inputData.second != null) {
                        transaction.addExpense(inputData.first!!, inputData.second!!)
                    } else {
                        println("Error Input")
                    }
                }
                3 -> {
                    println("--Your Balance Summary--")
                    transaction.showTransactionSummary()
                }
                4 -> {
                    println("--Your Balance History--")
                    transaction.showTransactionHistory()
                }
                else -> {
                    println("Have a Nice Day!")
                    println("Exit...")
                    return
                }
            }
        }
    }
}

fun receiveTrxData(): Pair<String?, Double?> {
    print("Input Transaction Name: ")
    val name = readlnOrNull()

    print("Input Transaction Amount: ")
    val amount = readlnOrNull()?.toDouble()

    return name to amount
}
fun menu(): Int? {
    println("----------- Finance Manager -----------")
    println("1. Add Your Income")
    println("2. Add Your Expense")
    println("3. Your Balance Summary")
    println("4. Your Transaction History")
    println("5. Exit")
    print("Pilih Menu: ")
    return readlnOrNull()?.toInt()}