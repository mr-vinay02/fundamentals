package datastructure.completebinarytree;

public class BinaryTreeImplementation {
    public static void main(String[] args) {

        BinaryTree<Integer>  tree = new BinaryTree<>();

        tree.add(50);
        tree.add(40);
        tree.add(30);
        tree.add(60);
        tree.add(70);
        tree.printInOrder();
        tree.printPreOrder();
        tree.printPostOrder();

        System.out.println("Level of the tree "+tree.level());
        System.out.println("Number of the Nodes of the tree "+tree.NumberOfNodes());
        System.out.println("Number of the Leaf nodes "+tree.NumberOfLeafNodes());
        System.out.println("Smallest Node is " + tree.smallestNode());
        System.out.println("Biggest Node is " + tree.biggestNode());
        System.out.println("sum of the nodes in the tree " + tree.sum());
        tree.delete(50);
        tree.printInOrder();
        tree.levelOrder();

        System.out.println(tree.searchByBFS(40));
        System.out.println(tree.searchByDFS(40));
    }
}
