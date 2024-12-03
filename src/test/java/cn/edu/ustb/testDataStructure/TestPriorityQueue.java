package cn.edu.ustb.testDataStructure;

import org.junit.jupiter.api.Test;
import priorityQueue.dataStructure.Entry;
import priorityQueue.dataStructure.MaxHeapImitate;
import priorityQueue.dataStructure.OrderedArrayImitate;
import priorityQueue.dataStructure.UnorderedArrayImitate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestPriorityQueue {
    @Test
    public void testUnOrderedArrayImitate() {
        UnorderedArrayImitate<Entry> queue = new UnorderedArrayImitate<>(5);
        queue.offer(new Entry("task1", 4));
        queue.offer(new Entry("task2", 3));
        queue.offer(new Entry("task3", 2));
        queue.offer(new Entry("task4", 5));
        queue.offer(new Entry("task5", 1));
        assertFalse(queue.offer(new Entry("task6", 9)));

        assertEquals(5, queue.poll().priority());
        assertEquals(4, queue.poll().priority());
        assertEquals(3, queue.poll().priority());
        assertEquals(2, queue.poll().priority());
        assertEquals(1, queue.poll().priority());
    }

    @Test
    public void testOrderedArrayImitate() {
        OrderedArrayImitate<Entry> queue = new OrderedArrayImitate<>(5);
        queue.offer(new Entry("task1", 4));
        queue.offer(new Entry("task2", 3));
        queue.offer(new Entry("task3", 2));
        queue.offer(new Entry("task4", 5));
        queue.offer(new Entry("task5", 1));
        assertFalse(queue.offer(new Entry("task6", 9)));

        assertEquals(5, queue.poll().priority());
        assertEquals(4, queue.poll().priority());
        assertEquals(3, queue.poll().priority());
        assertEquals(2, queue.poll().priority());
        assertEquals(1, queue.poll().priority());
    }

    @Test
    public void testHeapImitate() {
        MaxHeapImitate<Entry> queue = new MaxHeapImitate<>(5);
        queue.offer(new Entry("task1", 4));
        queue.offer(new Entry("task2", 3));
        queue.offer(new Entry("task3", 2));
        queue.offer(new Entry("task4", 5));
        queue.offer(new Entry("task5", 1));
        assertFalse(queue.offer(new Entry("task6", 9)));

        assertEquals(5, queue.poll().priority());
        assertEquals(4, queue.peek().priority());
        assertEquals(4, queue.poll().priority());
        assertEquals(3, queue.poll().priority());
        assertEquals(2, queue.poll().priority());
        assertEquals(1, queue.poll().priority());
    }
}
