package bst.traverse;

class MyCode {
    public static void main (String[] args) {
        MyTree<Integer> myTree = new MyTree<>();
        myTree.add(45);
        myTree.add(42);
        myTree.add(10);
        myTree.add(34);
        myTree.add(67);
        
        myTree.traverseInOrder();
    }
}

class MyTree<T> {
    TreeNode<T> root;
    int size;
    
    public void add(T value) {
        if (root == null) {
            root = new TreeNode<T>(value);
        } else {
            if (value.compareTo(root.value) < 0) {
                if (root.left == null) {
                    root.left = new TreeNode<T>(value);
                } else {
                    root.left.add(value);
                }
            } else {
                if (root.right == null) {
                    root.right = new TreeNode<T>(value);
                } else {
                    root.right.add(value);
                }
            }
        }
        size++;
    }
    
    public void traverseInOrder() {
        traverseInOrder(root);
    }
    
    private void traverseInOrder(TreeNode<T> node) {
        if (node == null) return;
        traverseInOrder(node.left);
        System.out.println(node.value);
        traverseInOrder(node.right);
    }
}

