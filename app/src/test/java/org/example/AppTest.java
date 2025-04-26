package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testQueueBasicOperations() {
        QueueTees queue = new QueueTees(2);

        Cutie puppy = new Puppy();
        Cutie kitty = new Kitty();

        assertEquals(0, queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);

        assertEquals(2, queue.size());

        Cutie first = queue.dequeue();
        assertEquals("A little puppy with big, sad eyes.", first.description());

        Cutie second = queue.dequeue();
        assertEquals("A fluffy kitten with tiny paws.", second.description());

        assertEquals(0, queue.size());
    }

    @Test
    public void testClear() {
        QueueTees queue = new QueueTees(1);

        Cutie cutie = new Puppy();

        queue.enqueue(cutie);
        assertEquals(1, queue.size());

        queue.clear();
        assertEquals(0, queue.size());
    }

    @Test
    public void testDequeueEmpty() {
        QueueTees queue = new QueueTees(1);
        assertNull(queue.dequeue());
    }
}
