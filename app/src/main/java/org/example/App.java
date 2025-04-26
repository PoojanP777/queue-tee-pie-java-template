package org.example;

public class App {
    public static void main(String[] args) {

        QueueTees queue = new QueueTees(3);

        
        Cutie puppy = new Puppy();
        Cutie kitty = new Kitty();
        Cutie marmoset = new PygmyMarmoset();

        
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        
        queue.enqueue(puppy);
        
        System.out.println("Current queue size: " + queue.size());

        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        
        queue.dequeue();

        
        queue.enqueue(puppy);
        System.out.println("Current queue size: " + queue.size());
        queue.clear();
        System.out.println("Current queue size after clearing: " + queue.size());
    }
}
