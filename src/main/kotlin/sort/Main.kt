package sort

import java.util.*

fun main() {
    val random = Random()
    val arr = IntArray(20)

    for (i in 0 until 20) {
        arr[i] = random.nextInt(100)
    }

    println("원본")
    arrayPrinter(arr)

    val sortedArray =
//        BubbleSort.sort(arr)
//        SelectionSort.sort(arr)
        InsertionSort.sort(arr)

    println("정렬된 배열")
    arrayPrinter(sortedArray)
}

fun arrayPrinter(arr: IntArray) {
    print("[")
    for (element in arr) {
        print(" $element")
    }
    println(" ]")
}