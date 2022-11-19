package sort

object BubbleSort : Sort() {
    override fun sort(arr: IntArray): IntArray = copy(arr).also {
        for (i in arr.indices) {
            for (j in 0 until arr.size - i - 1) {
                if (it[j] > it[j+1]) {
                    swap(it, j, j+1)
                }
            }
        }
    }
}