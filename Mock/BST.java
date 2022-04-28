class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    Node construct(int arr[], int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;
        Node temp = new Node(arr[mid]);
        temp.left = construct(arr, left, mid - 1);
        temp.right = construct(arr, mid + 1, right);

        return temp;
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    Node binaryCreate(int arr[], int index) {
        if (index < arr.length) {
            Node temp = new Node(arr[index]);
            root = temp;
            root.left = binaryCreate(arr, index * 2 + 1);
            root.right = binaryCreate(arr, index * 2 + 2);
        }
        return root;
    }

    Node deleteNode(int key) {
        return deleteHelper(root, key);
    }

    Node deleteHelper(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data) {
            root.left = deleteHelper(root.left, key);

        } else if (key > root.data) {
            root.right = deleteHelper(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minVal(root.right);
            root.right = deleteHelper(root.right, root.data);
        }
        return root;
    }

    int minVal(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }
        return min;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Node newRoot = tree.construct(arr, 0, arr.length - 1);
        tree.inOrder(newRoot);
        Node deletedNode = tree.deleteNode(6);
        tree.inOrder(deletedNode);
        // BST binaryTree = new BST();

        // int brr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // Node binaryRoot = binaryTree.binaryCreate(brr, 0);
        // binaryTree.inOrder(binaryRoot);
    }
}