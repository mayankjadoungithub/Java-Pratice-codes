package BST;
public  class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;

        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data> val){
            insert(root.left,val);
        } else{
            root.right = insert(root.right, val);
        }
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public static void mian(String a[]){
        int values[]={5,1,3,4,2,7};
        Node root= null;
        for(int i=0;i<values.length;i++){
            root= insert(root, values[i]);
        }
    }
}
