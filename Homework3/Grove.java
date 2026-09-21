public class Grove {
    // Contains two instance variables for an Array of Tree's (size 18), and a grove name.
    String groveName;

    Tree[] trees = new Tree[18];

    /**
     * Constructor for the Grove class. Initializes the grove with a name and empty tree arrays.
     * 
     * @param groveName the name of the grove
     */
    public Grove(String groveName) {
        this.groveName = groveName;
    }

    /**
     * Plants a tree in the grove. Returns the index of the tree if it was successfully planted, and -1 if the grove is full.
     * 
     * @param tree the tree to be planted
     * @return the index of the tree if it was successfully planted, and -1 if the grove is full
     */
    public int plantTree(Tree tree) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
                return i;
            }
        }

        return -1;
    }

    /**
     * Removes a tree from the grove. Returns the removed tree if it was successfully removed.
     * 
     * @param idNumber the id number of the tree to be removed
     * @return the removed tree if it was successfully removed
     */
    public Tree removeTree(int idNumber) {
        Tree removedTree = trees[idNumber];
        trees[idNumber] = null;

        return removedTree;
    }

    @Override
    public String toString() {
        int count = 0;
        
        for (Tree tree : trees) {
            if (tree != null) {
                count++;
            }
        }

        return Integer.toString(count);
    }
}
