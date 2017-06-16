package bst.traverse;

class TreeTraversalExample {
    public static void main (String[] args) {
        TreeNode<Integer> n1 = new TreeNode<>(45);
        TreeNode<Integer> n2 = new TreeNode<>(42);
        TreeNode<Integer> n3 = new TreeNode<>(10);
        TreeNode<Integer> n4 = new TreeNode<>(34);
        TreeNode<Integer> n5 = new TreeNode<>(67);
        
        TreeNode<Integer> root = n1;
        root.left = n2;
        n2.left = n3;
        n3.right = n4;
        root.right = n5;
        
        System.out.println("#In order");
        traverseInOrder(root);   
        
        System.out.println("#Pre order");
        traversePreOrder(root);
        
        System.out.println("#Post order");
        traversePostOrder(root);
    }
    
    public static void traverseInOrder(TreeNode<Integer> node) {
        if (node == null) return;
        traverseInOrder(node.left);
        System.out.println(node.value);
        traverseInOrder(node.right);
    }
    
    public static void traversePreOrder(TreeNode<Integer> node) {
        if (node == null) return;
        System.out.println(node.value);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
    
    public static void traversePostOrder(TreeNode<Integer> node) {
        if(node == null) return;
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.println(node.value);
    }
}

class TreeNode<T> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;
    
    public TreeNode(T value) {
        this.value = value;
    }
}
