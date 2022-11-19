package sort

object InsertionSort : Sort() {
    override fun sort(arr: IntArray): IntArray = copy(arr).also {
        for (i in 2 until arr.size) {
            val current = it[i]

            for (j in i - 1 downTo 0) {
                if (current < it[j]) swap(it, j, j + 1)
                else {
                    it[j + 1] = current
                    break
                }
            }
        }
    }
}