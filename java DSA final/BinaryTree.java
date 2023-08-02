class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class BinaryTree {
    public static void func(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        func(root.left);
        func(root.right);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        func(tree);
    }
}