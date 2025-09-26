package datastructure.dequeue;

public class MainDequeue {

    public static void main(String[] args) {
        Dequeue dq = new Dequeue(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display();  // Output: 2 5 10 20

        System.out.println("Front: " + dq.getFront()); // 2
        System.out.println("Rear: " + dq.getRear());   // 20

        dq.deleteFront();
        dq.display();  // Output: 5 10 20

        dq.deleteRear();
        dq.display();  // Output: 5 10
    }
}
