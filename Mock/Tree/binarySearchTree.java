package Tree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class binarySearchTree {

    Node root;

    Node construct(int arr[], int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        Node temp = new Node(arr[mid]);
        temp.left = construct(arr, left, mid - 1);
        temp.right = construct(arr, mid + 1, right);
        return temp;
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Node rootNode = tree.construct(arr, 0, arr.length - 1);
        tree.inOrder(rootNode);
    }
}
