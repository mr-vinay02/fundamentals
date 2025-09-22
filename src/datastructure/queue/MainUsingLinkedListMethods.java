package datastructure.queue;

public class MainUsingLinkedListMethods {
    public static void main(String[] args) {
        QueueUsingLinkedListMethods<String> queue = new QueueUsingLinkedListMethods<>();

        queue.add("vinay");
        queue.add("vijay");
        queue.add("ullas");
        queue.add("mummy");
        queue.add("daddy");

        queue.display();
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());

    }
}
