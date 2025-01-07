package day4;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyTree {

    private Node rootNode;

    public MyTree(int value) {
        this.rootNode.root = value;
    }

    private static class Node {
        private int root;
        private Node left;
        private Node right;
        private boolean isEnd;
    }

    public void addNode(Node rootNode, int value, Node left, Node right, boolean isEnd) {

    }

    public void searchNode() {

    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree(2);
        myTree.addNode(myTree.rootNode, 3,null,null,false);
    }
}
