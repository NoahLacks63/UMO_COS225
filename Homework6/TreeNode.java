public class TreeNode<T> {
    private T element;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }

    public void setElement(T element){
        this.element = element;
    }

    public TreeNode<T> getLeft(){
        return left;
    }

    public void setLeft(TreeNode<T> left){
        this.left = left;
    }

    public TreeNode<T> getRight(){
        return right;
    }

    public void setRight(TreeNode<T> right){
        this.right = right;
    }

    public boolean isLeaf(){
        return (this.getLeft() == null) && (this.getRight() == null);
    }

    //Best Case: O(1)
    //Worst Case: O(n)
    public boolean isIn(T target){
        if (this.element.equals(target)){
            return true;
        }
        else if (this.isLeaf()){
            return false;
        }
        else if ((this.getLeft() != null) && (this.getRight() == null)){
            return this.getLeft().isIn(target);
        }
        else if ((this.getLeft() == null) && (this.getRight() != null)){
            return this.getRight().isIn(target);
        }
        else if ((this.getLeft() != null) && (this.getRight() != null)){
            return this.getLeft().isIn(target) || this.getRight().isIn(target);
        }
        return false;
    }

    //O(n)
    public String preorder(){
        if (this.isLeaf()){
            return this.getElement().toString();
        }
        else if ((this.getLeft() != null) && (this.getRight() == null)){
            return this.getElement().toString() + " " + this.getLeft().preorder();
        }
        else if ((this.getLeft() == null) && (this.getRight() != null)){
            return this.getElement().toString() + " " + this.getRight().preorder();
        }
        else if ((this.getLeft() != null) && (this.getRight() != null)){
            return this.getElement().toString() + " " + 
            this.getLeft().preorder() + " " +
            this.getRight().preorder();
        }
        return "";
    }

    //O(n)
    public String postorder(){
        if (this.isLeaf()){
            return this.getElement().toString();
        }
        else if ((this.getLeft() != null) && (this.getRight() == null)){
            return this.getLeft().postorder() + " " + this.getElement().toString();
        }
        else if ((this.getLeft() == null) && (this.getRight() != null)){
            return this.getRight().postorder() + " " + this.getElement().toString();
        }
        else if ((this.getLeft() != null) && (this.getRight() != null)){
            return this.getLeft().postorder() + " " +
            this.getRight().postorder() + " " +
            this.getElement().toString();
        }
        return "";
    }

    //Height of a empty tree = -1
    //Height of a leaf = 0
    //Height of a node = max(left, right) + 1
    //Worst Case: O(n)
    //Best Case: O(n)
    public int height(){
        if (this.isLeaf()){
            return 0;
        }
        else if ((this.getLeft() != null) && (this.getRight() == null)){
            return this.getLeft().height() + 1;
        }
        else if ((this.getLeft() == null) && (this.getRight() != null)){
            return this.getRight().height() + 1;
        }
        else{
            return Math.max(this.getLeft().height(), 
            this.getRight().height()) + 1;
        }
    }

    //Balanced: Height Difference of descendents <= 1
    //Worst Case: O(n log n)
    //Best Case: O(n log n)
    public boolean isBalanced(){
        if (this.isLeaf()){
            return true;
        }
        else if ((this.getLeft() != null) && (this.getRight() == null)){
            return Math.abs(this.getLeft().height() - -1) <= 1;
        }
        else if ((this.getLeft() == null) && (this.getRight() != null)){
            return Math.abs(this.getRight().height() - -1) <= 1;
        }
        else{
            return Math.abs(this.getLeft().height() - 
            this.getRight().height()) <= 1;
        }
    }

    //Insert (bad)
    //O(n log n)
    public void insert(T element){
        if (this.isLeaf()){
            this.setLeft(new TreeNode<T>(element));
        }
        else if ((this.getLeft() != null) && (this.getRight() == null)){
            this.setRight(new TreeNode<T>(element));
        }
        else if ((this.getLeft() == null) && (this.getRight() != null)){
            this.setLeft(new TreeNode<T>(element));
        }
        else{
            if (this.getLeft().height() <= this.getRight().height()){
                this.getLeft().insert(element);
            }
            else{
                this.getRight().insert(element);
            }
        }
    }

    //Helper functions for HW6, non-recursive, must be called
    //at the node you want to insert at, will fail silently
    //if that spot is taken
    public TreeNode<T> insertLeft(T element){
        if (this.getLeft() == null){
            TreeNode<T> node = new TreeNode<T>(element);
            this.setLeft(node);

            return node;
        }

        return null;
    }

    public TreeNode<T> insertRight(T element){
        if (this.getRight() == null){
            TreeNode<T> node = new TreeNode<T>(element);
            this.setRight(node);

            return node;
        }

        return null;
    }

}
