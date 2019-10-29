class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
       }
}

public class BinaryTree {
 
    Node root;
 
 private Node addRecursive(Node current, int value) {
    if (current == null) {
        return new Node(value);
    }
 
    if (value < current.value) {
        current.left = addRecursive(current.left, value);
    } else if (value > current.value) {
        current.right = addRecursive(current.right, value);
    } else {
        // value already exists
        return current;
    }
 
    return current;
}

public void add(int value) {
    root = addRecursive(root, value);
}

public static void main(String [] args){
    BinaryTree bt = new BinaryTree();
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
    System.out.println("The binary tree is created");
     System.out.println("\n Preorder traversal");
      bt.traversePreOrder(bt.root);
     System.out.println("\n Inorder traversal");
     bt.traverseInOrder(bt.root);
    System.out.println("\n Postorder traversal");
     bt.traversePostOrder(bt.root);
    System.out.println("\n The Normal tree is created");
	BinaryTree bt2 = new BinaryTree();
  bt2.root = new Node(5);
  bt2.root.left = new Node(7);
    bt2.root.right  = new Node(8);
    System.out.println("\n Preorder traversal");
     bt2.traversePreOrder(bt2.root);
     System.out.println("\n Inorder traversal");
     bt.traverseInOrder(bt2.root);
      System.out.println("\n Postorder traversal");
     bt.traversePostOrder(bt2.root);
  
}

public void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.value);
    }
}
    
public void traversePreOrder(Node node) {
    if (node != null) {
        System.out.print(" " + node.value);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

public void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.value);
        traverseInOrder(node.right);
    }
}

}