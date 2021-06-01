/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1_4;

/**
 *
 * @author irulg
 */
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }
    
    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
    
    // NOMOR 1 : ADD RECURSION
    void addRec(int data){
        addData(data, root);
    }
    
    void addData(int i, Node n) {
        if (root == null){
            root = new Node(i);
            return;
        }else if (i < n.data) {
            if (n.left != null) {
                addData(i, n.left);
            } else {
                n.left = new Node(i);
            }
        } else if (i > n.data) {
            if (n.right != null) {
                addData(i, n.right);
            } else {
                n.right = new Node(i);
            }
        }
    }
    // END
    
    // NOMOR 2 : FIND MINIMUM and MAXIMUM
    public int findMinValue() {
 
        return minValue(this.root);
    }
 
    public int findMaxValue() {
 
        return maxValue(this.root);
    }
 
    int minValue(Node node) {
 
        if(node.left != null) {
            return minValue(node.left);
        }
        return node.data;
    }
 
    int maxValue(Node node) {
 
        if(node.right != null) {
            return maxValue(node.right);
        }
        return node.data;
    }
    // END
    
    // NOMOR 3 : Print all in leaf
    public void printLeaf(Node node){
        if(node == null){
            return;
        }
        
        if(node.left == null && node.right == null){
            System.out.printf("%d ", node.data);
        }
        
        printLeaf(node.left);
        printLeaf(node.right);
    }
    // END
    
    // NOMOR 4 : Count Leaf
    int countLeaf(Node node) {
        if(node == null) {
          return 0;
        }

        if (node.left == null && node.right == null) {
          return 1;
        }else {
          return countLeaf(node.left) + countLeaf(node.right);
        }
    }
    // END
    
    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}