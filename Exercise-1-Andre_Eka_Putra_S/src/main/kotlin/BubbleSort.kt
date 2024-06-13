class BubbleSort {
    operator fun invoke(list: List<Int>, desc: Boolean = false): List<Int> {
        var unSortedList = list.toMutableList()
        for ((_, _) in list.withIndex()) {
            var i = 0
            while(true) {
                val j = i+1
                if ((i + 1) < unSortedList.size) {
                    val compared = compareGreaterThan(unSortedList[i], unSortedList[j])
                    if (compared) {
                        unSortedList = swapValue(i, j, unSortedList)
                    }
                    i += 1
                } else {
                    break
                }
            }
        }
        return if (desc) unSortedList.toList().asReversed() else unSortedList.toList()
    }

    private fun compareGreaterThan(a: Int, b: Int): Boolean {
        return a >= b
    }

    private fun swapValue(a: Int, b: Int, theList: MutableList<Int>): MutableList<Int> {
        val tempValueA = theList[a]
        val tempValueB = theList[b]

        theList[a] = tempValueB
        theList[b] = tempValueA
        return theList

    }
}