package sort

object QuickSort : Sort() {
    override fun sort(arr: IntArray): IntArray = copy(arr).also {
        divideAndConquer(it, 0, arr.size - 1)
    }

    private fun divideAndConquer(arr: IntArray, left: Int, right: Int) {
        if (left < right) {
            val pivot = partition(arr, left, right)

            divideAndConquer(arr, left, pivot - 1)
            divideAndConquer(arr, pivot + 1, right)
        }
    }

    private fun partition(arr: IntArray, left: Int, right: Int): Int {
        val pivot = arr[left]
        var low = left + 1
        var high = right

        while (low <= high) {
            while (low <= right && pivot >= arr[low]) low++
            while (high >= left + 1 && pivot <= arr[high]) high--

            if (low <= high) swap(arr, low, high)
        }

        swap(arr, left, high)
        return high
    }
}