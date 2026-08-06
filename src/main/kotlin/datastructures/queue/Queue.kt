package datastructures.queue

class Queue<T> (
    private var items: MutableList<T>
) {
    private var size: Int = items.size

    fun queue(item: T) {
        size++
        items.add(item)
    }

    fun dequeue() {
        items.removeAt(0)
        size--
    }

    fun isEmpty(): Boolean = size == 0
    fun getSize(): Int = size
}