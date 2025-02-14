package day09.tree.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(17);
        myTree.insertNode(15);
        myTree.insertNode(14);
        myTree.insertNode(19);
        myTree.insertNode(18);
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(11);
        myTree.insertNode(12);
        myTree.insertNode(16);
        myTree.insertNode(11);

        System.out.println(myTree.head.value);
        System.out.println(myTree.head.left.value);
        System.out.println(myTree.head.left.right.value);

        System.out.println("=====");

        System.out.println(myTree.head.right.value);
        System.out.println(myTree.head.right.left.value);

    }
}
