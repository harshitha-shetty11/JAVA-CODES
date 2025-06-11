import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree {
    static Scanner sc = new Scanner(System.in);
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
	public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
			inorder(root.left);
            inorder(root.right);
        }
    }
	public static void postorder(Node root) {
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
			System.out.print(root.data + " ");
        }
    }
	
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        System.out.println("Enter elements to insert into BST (type -1 to stop):");
        while (true) {
            int value = sc.nextInt();
            if (value == -1) break;
            root = insert(root, value);
        }

        System.out.println("InOrder Traversal:");
        inorder(root);
        System.out.println();
		
        System.out.println("PreOrder Traversal:");
        preorder(root);
        System.out.println();
		
        System.out.println("PostOrder Traversal:");
        postorder(root);
        System.out.println();

        System.out.print("Enter value to search:");
        int key = sc.nextInt();
        if (search(root, key)) {
            System.out.println(key + " is found in the BST.");
        } else {
            System.out.println(key + " is NOT found in the BST.");
        }
    }
}
