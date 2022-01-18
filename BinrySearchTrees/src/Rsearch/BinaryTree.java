package Rsearch;

/*
* insert operations have a worse ccase complexity of O(logn)
* binary tree has nodes.
* each node has only two children
* top level note is the root node and has no parent
* height of the tree is the levels between the root and last node
* the shallower the height is the fater the operations of the binary tree
* rach node has two pointers going to either left or right
* the left child will always have a smaller value than the parent or the right child
*
* when serching check if root is empty otherwise recursively check the children
*use the comparable method
*
* inserting
* check root, then look recursively where to add the key value pair
*
* The left subtree of a node contains only nodes with keys lesser than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree.
There must be no duplicate nodes.
*
*
*
*
*
* */
public class BinaryTree {

    /* Class containing left and right child of current node and key value*/
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinaryTree()
    {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key)
    {

        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key)
    {

        /* If the tree is empty, return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}

