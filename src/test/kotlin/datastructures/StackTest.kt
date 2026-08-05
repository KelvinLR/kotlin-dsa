package datastructures

import org.junit.jupiter.api.Test
import datastructures.stack.Stack

class StackTest {
    @Test
    fun testPop() {
        val stack = Stack<Int>(mutableListOf(1, 2, 3, 4, 5))
        stack.pop()
        assert(stack.getSize() == 4)
    }

    @Test
    fun testPush() {
        val stack = Stack<Int>(mutableListOf())
        stack.push(1)
        assert(stack.getSize() == 1)
    }

}