package day09.tree.binarySearchTree;
// 1. Node 생성 => Root
// 2. BST 에 데이터 넣은 기능 구현
public class NodeMgmt {
    Node head = null;
    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }
    public boolean insertNode(int data) {
        // CASE1 : Node 가 하나도 없을 때
        if (this.head == null) this.head = new Node(data);
        else {// CASE2 : Node 가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while(true) {
                // CASE2-1 : 현재 Node 의 왼쪽에 Node 가 들어가야 할 때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                } else {// CASE2-2 : 현재 Node 의 오른쪽에 Node 가 들어가야 할 때
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }
    public Node search(int data) {
        //CASE 1 : Node 가 하나도 없을 때
        if (head == null) return null;
        else {//CASE 2 : Node 가 하나 이상일 때
            Node findNode = this.head;
            while(findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
        }
        return null;
    }
//    public boolean delete (int data){
//        Node findNode = this.head;
//        findNode.
//    }
}
