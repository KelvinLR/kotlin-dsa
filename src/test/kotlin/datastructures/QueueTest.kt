package datastructures

import org.junit.jupiter.api.Test
import datastructures.queue.Queue

class QueueTest {
    @Test
    fun testDequeue() {
        val queue = Queue<Int>(mutableListOf())
        queue.dequeue()
        assert(queue.getSize() == 1)
    }

    @Test
    fun testQueue() {
        val queue = Queue<Int>(mutableListOf(1, 2, 3, 4, 5))
        queue.queue(6)
        assert(queue.getSize() == 4)
    }
}