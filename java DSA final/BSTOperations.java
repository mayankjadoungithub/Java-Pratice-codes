public class BSTOperations {
    BST root;
    void insert(int data){
        root = insert(root,data);
    }
    BST insert(BST root,int data){
        if(this.root== null){
            this.root=new BST(data);
            return root;
        }
        if(data< root.data){
            root.left= insert(root.left,data);
        }
        else if(data > root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    BST search(BST root,int data){
        // Base Case
        if(root==null|| root.data == data){
            return root;
        }
        if(root.data > data){
            return search(root.left,data);

        }
        return search(root.right, data);
    }
    // min element in BST - Always in left
    int minElement(BST root){
        int minv = root.data;
        while(root.left!=null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;

    }
    int maxElement(BST root){
        int minv = root.data; 
        while(root.left!=null){
            maxv = root.right.data;
            root = root.right;
        }
        return maxv;

    }

    void add(BST root,int data){
        if(data   )
    }
    void print(){
        inorder(root);
    }
    void inorder(BST root){
        if(root != null){
            inorder()
        }
    }
}
