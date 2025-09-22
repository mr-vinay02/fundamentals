package datastructure;

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(50);
        list.addFirst(05);
        list.add(63,2);
        list.add(10);
        list.display();
        System.out.println(list.delete(2));

        list.deleteFirst();
        list.deleteLast();
        list.display();

        list.printBackward();



        System.out.println(list.checkPalindrome());
    }

}
