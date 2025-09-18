package datastructure;

public class SingleLinkedImplementation {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.addFirst(5);
        list.addMiddle(25,3);

        list.display();
        System.out.println("--------------------------------------------------------");
        System.out.println(list.deleteLast());
        System.out.println(list.deleteFirst());
        System.out.println(list.delete(3));
        System.out.println("--------------------------------------------------------");
        list.display();
        System.out.println("--------------------------------------------------------");
        list.printBackwards();
        System.out.println("--------------------------------------------------------");
        list.reverse();;
        list.display();
        System.out.println(list.size());

        System.out.println(list.checkPalindrome());

        System.out.println(list.isLoop());

    }
}
