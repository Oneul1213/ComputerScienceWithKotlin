package sort

abstract class Sort {
    abstract fun sort(arr: IntArray): IntArray

    fun copy(arr: IntArray): IntArray {
        val copied = IntArray(arr.size)
        for ((i, element) in arr.withIndex()) {
            copied[i] = element
        }

        return copied
    }

    fun swap(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}