class SelectionSort {
    operator fun invoke(list: List<Int>, desc: Boolean = false): List<Int> {
        var unSortedList = list.toMutableList()
        for ((index, _) in unSortedList.withIndex()) {
            var idxSmall = index
            for (j: Int in index until unSortedList.size ) {
                val isGreaterThan = compareGreaterThan(unSortedList[idxSmall], unSortedList[j])
                if (isGreaterThan) {
                    idxSmall = j
                }
            }
            unSortedList = swapValue(index, idxSmall, unSortedList)
        }
        return if (desc) unSortedList.toList().asReversed() else unSortedList.toList()
    }

    // True if A >= B
    private fun compareGreaterThan(a: Int, b: Int): Boolean {
        return a >= b
    }

    // Swap The Value list[a] with list[b]
    private fun swapValue(a: Int, b: Int, theList: MutableList<Int>): MutableList<Int> {
        val tempValueA = theList[a]
        val tempValueB = theList[b]

        theList[a] = tempValueB
        theList[b] = tempValueA
        return theList
    }
}