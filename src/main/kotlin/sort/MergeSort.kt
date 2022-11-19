package sort

object MergeSort : Sort() {
    override fun sort(arr: IntArray): IntArray = copy(arr).also {
        divide(it, 0, arr.size - 1)
    }

    private fun divide(arr: IntArray, left: Int, right: Int) {
        val mid = (left + right) / 2

        if (left < right) {
            divide(arr, left, mid)
            divide(arr, mid + 1, right)

            merge(arr, left, mid, right)
        }
    }

    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
        var leftStartIdx = left
        var rightStartIdx = mid + 1

        val sorted = IntArray(arr.size)
        var sortedIdx = left

        while (leftStartIdx <= mid && rightStartIdx <= right) {
            if (arr[leftStartIdx] < arr[rightStartIdx]) {
                sorted[sortedIdx] = arr[leftStartIdx++]
            } else {
                sorted[sortedIdx] = arr[rightStartIdx++]
            }

            sortedIdx++
        }

        if (leftStartIdx > mid) {
            while (rightStartIdx <= right) {
                sorted[sortedIdx++] = arr[rightStartIdx++]
            }
        } else {
            while (leftStartIdx <= mid) {
                sorted[sortedIdx++] = arr[leftStartIdx++]
            }
        }

        for (i in left..right) {
            arr[i] = sorted[i]
        }
    }
}