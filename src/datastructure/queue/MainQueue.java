package datastructure.queue;

public class MainQueue {
    public static void main(String[] args) {

        QueueImplementation<String> queue = new QueueImplementation<>();
        queue.add("vinay");
        queue.add("vijay");
        queue.add("ullas");
        queue.add("abhi");
        queue.add("basu");

        queue.display();

        System.out.println(queue.peek());
        System.out.println(queue.size());

        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());




    }
}
