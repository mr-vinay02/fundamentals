package datastructure.dequeue;

public class Dequeue {
    private int[] arr;
    private int front, rear, size, capacity;

    public Dequeue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = 0;
    }

    // Check if deque is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Insert at front
    public void insertFront(int x) {
        if (isFull()) {
            System.out.println("Deque is full!");
            return;
        }
        if (front == -1) { // first element
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = x;
        size++;
    }

    // Insert at rear
    public void insertRear(int x) {
        if (isFull()) {
            System.out.println("Deque is full!");
            return;
        }
        if (front == -1) { // first element
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = x;
        size++;
    }

    // Delete from front
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        if (front == rear) { // only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
    }

    // Delete from rear
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        if (front == rear) { // only one element
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
    }

    // Get front element
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return arr[front];
    }

    // Get rear element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        return arr[rear];
    }

    // Display deque
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        int i = front;
        System.out.print("Deque elements: ");
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
