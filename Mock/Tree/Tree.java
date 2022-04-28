package Tree;

import java.util.ArrayList;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class Tree {
    Node root;

    Node construct(int arr[], int index) {
        Node temp = null;
        if (index < arr.length) {
            if (arr[index] == -1)
                return null;
            temp = new Node(arr[index]);
            temp.left = construct(arr, 2 * index + 1);
            temp.right = construct(arr, 2 * index + 2);
        }
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

    void findNodes(int target, Node root, int k) {

    }

    void findNode(int target, Node root, int k) {
        if (root == null)
            return;

        if (root.data == target) {
            // do something here
            addTolist(root, k);
        }
        findNode(target, root.left, k);
        findNode(target, root.right, k);
    }

    ArrayList<Integer> list = new ArrayList<Integer>();

    void addTolist(Node root, int k) {
        if (k == 0)
            list.add(root.data);
        if (root.left == null && root.right == null) {
            return;
        }

        addTolist(root.left, k - 1);
        addTolist(root.right, k - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4 };
        int target = 3, k = 2;
        Tree tree = new Tree();

        Node rootNode = tree.construct(arr, 0);
        tree.inOrder(rootNode);
        tree.findNode(target, rootNode, k);
        System.out.println(tree.list);
    }
}

/**
 * Given the root of a binary tree, the value of a target node target, and an
 * integer k, return an array of the values of all nodes that have a distance k
 * from the target node.
 * 
 * You can return the answer in any order.
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
 * Output: [7,4,1]
 * Explanation: The nodes that are a distance 2 from the target node (with value
 * 5) have values 7, 4, and 1.
 * Example 2:
 * 
 * Input: root = [1], target = 1, k = 3
 * Output: []
 */

// 3
// 5 1
// 6 2 0 8
// 7 4

/**
 * There are n cities. Some of them are connected, while some are not. If city a
 * is connected directly with city b, and city b is connected directly with city
 * c, then city a is connected indirectly with city c.
 * 
 * A province is a group of directly or indirectly connected cities and no other
 * cities outside of the group.
 * 
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the
 * ith city and the jth city are directly connected, and isConnected[i][j] = 0
 * otherwise.
 * 
 * Return the total number of provinces.
 * 
 * 
 * Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 * Output: 2
 * 
 * Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 */

// 1 1 0 1 1 0 0 0 1
