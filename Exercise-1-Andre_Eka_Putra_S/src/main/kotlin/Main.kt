fun main() {
    var history = mutableListOf<SortData>()
    var sortedList: List<Int>
    while (true) {
        val menu = menu()
        menu?.let {
            when(it) {
                1 -> {
                    val listData = inputTheList()
                    listData?.let { list->
                        val bubbleSort = BubbleSort()
                        sortedList = bubbleSort(list, desc = false)
                        print("Sorted List (Asc): ")
                        println(sortedList)
                        history = addToHistory("Bubble Sort (Asc)", sortedList, history)
                    }
                }
                2 -> {
                    val listData = inputTheList()
                    listData?.let { list->
                        val bubbleSort = BubbleSort()
                        sortedList = bubbleSort(list, desc = true)
                        print("Sorted List (Desc): ")
                        println(sortedList)
                        history = addToHistory("Bubble Sort (Desc)", sortedList, history)
                    }
                }
                3 -> {
                    val listData = inputTheList()
                    listData?.let { list->
                        val selectionSort = SelectionSort()
                        sortedList = selectionSort(list, desc = false)
                        print("Sorted List (Asc): ")
                        println(sortedList)
                        history = addToHistory("Selection Sort (Asc)", sortedList, history)
                    }
                }
                4 -> {
                    val listData = inputTheList()
                    listData?.let { list->
                        val selectionSort = SelectionSort()
                        sortedList = selectionSort(list, desc = true)
                        print("Sorted List (Desc): ")
                        println(sortedList)
                        history = addToHistory("Selection Sort (Desc)", sortedList, history)
                    }
                }
                5 -> {
                    println("History Sorting:")
                    history.ifEmpty {
                        println("Tidak ada history")
                    }
                    history.forEachIndexed { index, sortData ->
                        println("No. ${index+1}. ${sortData.sortAlgorithm}, ${sortData.result}")
                    }
                }
                else -> return
            }
        }
    }
}

fun menu(): Int? {
    println("------------" + "Sorting Application" + "------------")
    println("1. Bubble Sort (Asc)")
    println("2. Bubble Sort (Desc)")
    println("3. Selection Sort (Asc)")
    println("4. Selection Sort (Desc)")
    println("5. Show History")
    println("0. Exit")
    print("Pilih Menu: ")
    return readlnOrNull()?.toInt()
}

fun addToHistory(name: String, list: List<Int>, history: MutableList<SortData>): MutableList<SortData> {
    val sortData = SortData(sortAlgorithm = name, result = list.toString())
    history.add(sortData)
    return history
}

fun inputTheList(): List<Int>? {
    print("Input list nya (Pisah dengan spasi): ")
    val input = readlnOrNull()
    return if (!input.isNullOrBlank()) {
        val stringValues = input.trim().split("\\s+".toRegex())
        val listInteger = stringValues.mapNotNull { it.toIntOrNull() }
        listInteger
    } else {
        println("List Kosong")
        null
    }
}