package datastructures.stack

import java.util.EmptyStackException

class Stack<T>(
    private var items: MutableList<T>
    // list nao permite mutabilidade ent tem q ser a mutable
) {
    private var size: Int = items.size

    fun push(item: T) {
        size++
        items.add(item)
    }

    fun pop(): T {
        if(items.isEmpty()) {
            throw EmptyStackException()
        }

        items.removeAt(size-1)
        size--

        return items.last()
    }

    fun isEmpty(): Boolean = size == 0
    fun getSize(): Int = size
}