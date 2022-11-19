package sort

object SelectionSort : Sort() {
    override fun sort(arr: IntArray): IntArray = copy(arr).also {
        for (i in arr.indices) {
            var minNum = it[i]
            var minIdx = i
            for (j in i+1 until arr.size) {
                if (minNum > it[j]) {
                    minNum = it[j]
                    minIdx = j
                }
            }

            swap(it, i, minIdx)
        }
    }
}