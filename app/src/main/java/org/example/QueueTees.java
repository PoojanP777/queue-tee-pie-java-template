package org.example;

import java.util.ArrayList;

public class QueueTees {
    private ArrayList<Cutie> queue;
    private int maxSize;

    public QueueTees(int size) {
        this.maxSize = size;
        queue = new ArrayList<>(size);
    }

    public void enqueue(Cutie item) {
        if (queue.size() < maxSize) {
            queue.add(item);
            System.out.println("Enqueued: " + item.description());
        } else {
            System.out.println("Queue is full. Cannot enqueue.");
        }
    }

    public Cutie dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Cutie removed = queue.remove(0);
        System.out.println("Dequeued: " + removed.description());
        return removed;
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
        System.out.println("Queue has been cleared.");
    }
}

