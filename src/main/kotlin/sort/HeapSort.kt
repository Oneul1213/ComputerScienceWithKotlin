package sort

import java.util.PriorityQueue

object HeapSort : Sort() {
    override fun sort(arr: IntArray): IntArray {
        val heap = PriorityQueue<Int>()
        arr.forEach { heap.add(it) }

        val sorted = IntArray(arr.size)
        for (i in arr.indices) {
            sorted[i] = heap.remove()
        }

        return sorted
    }
}