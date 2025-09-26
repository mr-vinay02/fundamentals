package collection.list.stack.queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.push(45);
        queue.push(65);
        queue.push(12);
        queue.push(85);
        queue.push(32);
        System.out.println(queue.remove());

    }
}
