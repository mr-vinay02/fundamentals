package datastructure.completebinarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree<T extends Number & Comparable<T>> {

    // Create class called Node : data is stored
    class Node {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
        }
    }

    Node root;

    // Adding the element to the tree
    public boolean add(T data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node tempravaryRoot = root;
        while (true) {
            int greater = data.compareTo(tempravaryRoot.data);

            if (greater < 0) {
                if (tempravaryRoot.left == null) {
                    tempravaryRoot.left = newNode;
                    return true;
                }
                tempravaryRoot = tempravaryRoot.left;
            } else if (greater > 0) {
                if (tempravaryRoot.right == null) {
                    tempravaryRoot.right = newNode;
                    return true;
                }
                tempravaryRoot = tempravaryRoot.right;
            }
        }
    }

    // Print inorder traversal
    public void printInOrder() {
        System.out.println("Printing the elements in Inorder:");
        inOrder(root);
        System.out.println(); // newline after traversal
    }

    // Recursive inorder helper
    private void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    //  Printing the element in the PreOrder
    public void printPreOrder() {
        System.out.println("Printing the element in the PreOrder : ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + "  ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // printing the element in the post order
    public void printPostOrder() {
        System.out.println("Printing the elements in the PostOrder : ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node root) {

        if (root == null)
            return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data);
    }

    // Finding the number of the level of the tree
    public int level() {
        return level(root);
    }

    private int level(Node root) {
        if (root == null)
            return 0;

        int leftLevel = level(root.left);
        int rightLevel = level(root.right);

        return Math.max(leftLevel, rightLevel) + 1;
    }

    // Number of the Nodes in the tree
    public int NumberOfNodes() {
        return nodes(root);
    }

    private int nodes(Node root) {
        if (root == null)
            return 0;

        return nodes(root.right) + nodes(root.left) + 1;
    }


    // NUmber of the Leaf Nodes
    public int NumberOfLeafNodes() {
        return leafNodes(root);
    }

    private int leafNodes(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        return leafNodes(root.left) + leafNodes(root.right);
    }

    //   Finding the smallest node in the tree
    public T smallestNode() {
        Node temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.data;
    }

    // finding the biggest node in the tree
    public T biggestNode() {
        Node temp = root;

        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }


    // calculating the sum of the nodes in the tree
    public double sum() {
        return sum(root);
    }

    private double sum(Node root) {
        if (root == null)
            return 0.0;

        return sum(root.left) + sum(root.right) + root.data.doubleValue();
    }

    // delete an elemant from the tree
   public Node delete(T key) {
       root = delete(root, key);   // update root as well
       return root;
}

   private Node delete(Node root, T key) {
       if (root == null)
        return null;

    int comparedValue = key.compareTo(root.data);

       if (comparedValue < 0)
        root.left = delete(root.left, key);

       else if (comparedValue > 0)
        root.right = delete(root.right, key);

    else {
           // case 1: leaf node
           if (root.left == null && root.right == null)
               return null;

           // case 2: one child
           else if (root.left == null)
               return root.right;

           else if (root.right == null)
               return root.left;

           // case 3: two children
           Node minRight = minRight(root.right);
           root.data = minRight.data;
           root.right = delete(root.right, minRight.data);
       }
       return root;
   }


    private Node minRight(Node root) {

        while(root.left != null)
        {
            root = root.left;

        }
        return root;
    }

    //Printing the element based on the levels
    public void levelOrder()
    {
        if(root == null)
            return;

        Queue<Node> levels = new LinkedList<Node>();

        levels.add(root);

        int level =0;

        while(!levels.isEmpty())
        {
            int  sizeOfLevels = levels.size();
            for (int i = 0; i < sizeOfLevels; i++) {

                Node polledNode = levels.poll();
                System.out.print(polledNode.data);

                if(polledNode.left != null)
                    levels.add(polledNode.left);

                if(polledNode.right != null)
                    levels.add(polledNode.right);

            }
            level++;
            System.out.println();
        }
    }

    // search element by Breadth First Search
    public boolean searchByBFS(T key)
    {
        if(root == null)
            return false;

        Queue<Node> levels = new LinkedList<>();

        int level = 0;
        levels.add(root);

        while(!levels.isEmpty()){

            int noOfElement = levels.size();

            for (int i = 0; i < noOfElement; i++) {

                Node polledNode = levels.poll();
                if(polledNode.data == key)
                    return true;

                if(polledNode.left != null)
                    levels.add(polledNode.left);

                if(polledNode.right != null)
                    levels.add(polledNode.right);
            }
            level++;
            System.out.println();
        }
        return false;
    }

    // search an element Using Depth First Search
    public boolean searchByDFS(T key)
    {
        if(root == null)
            return false;

        Stack<Node> levels = new Stack<>();

        levels.push(root);
        int level = 0;

        while(!levels.isEmpty())
        {
            int noOfElements = levels.size();

            for (int i = 0; i < noOfElements; i++) {

                Node popedNode  = levels.pop();

                if( popedNode.data == key)
                    return true;


                if(popedNode.right != null)
                    levels.push(popedNode.right);

                if(popedNode.left != null)
                    levels.push(popedNode.left);
            }
        }
        return false;
    }




}
