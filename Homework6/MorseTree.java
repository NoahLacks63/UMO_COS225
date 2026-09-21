public class MorseTree {
    private TreeNode<Character> root;

    public MorseTree() {
        root = new TreeNode<Character>('\0');

        // Dot side
        root.insertLeft('e')
            .insertLeft('i')
            .insertLeft('s')
            .insertLeft('h');
        
        root.getLeft()
            .getLeft()
            .getLeft()
            .insertRight('v');

        root.getLeft()
            .getLeft()
            .insertRight('u')
            .insertLeft('f');
        
        root.getLeft()
            .insertRight('a')
            .insertRight('w')
            .insertRight('j');

        root.getLeft()
            .getRight()
            .insertLeft('r')
            .insertLeft('l');

        root.getLeft()
            .getRight()
            .getRight()
            .insertLeft('p');


        // Dash side
        root.insertRight('t')
            .insertRight('m')
            .insertRight('o');
        
        root.getRight()
            .getRight()
            .insertLeft('g')
            .insertRight('q');

        root.getRight()
            .getRight()
            .getLeft()
            .insertLeft('z');
        
        root.getRight()
            .insertLeft('n')
            .insertRight('k')
            .insertRight('y');

        root.getRight()
            .getLeft()
            .getRight()
            .insertLeft('c');

        root.getRight()
            .getLeft()
            .insertLeft('d')
            .insertRight('x');

        root.getRight()
            .getLeft()
            .getLeft()
            .insertLeft('b');
    }

    public String getPreorder() {
        return root.preorder();
    }

    public String getPostorder() {
        return root.postorder();
    }

    /**
     * Converts a string to morse code.
     * 
     * @param input The string to convert.
     * 
     * @return The morse code.
     */
    public String toMorse(String input) {
        String output = "";

        for(char c : input.strip().toLowerCase().toCharArray()) {
            if (c == ' ') continue;
            
            output += findPath(root, c, "") + "|";
        }

        return output;
    }

    /**
     * Converts morse code to a string.
     * 
     * @param input The morse code to convert.
     * 
     * @return The converted string.
     */
    public String toString(String input) {
        String output = "";
        String s = input.strip();

        TreeNode<Character> node = root;

        for(char c : s.toCharArray()) {
            if(c == '|') {
                output += node.getElement().toString();
                node = root;
            } else if(c == '.') {
                node = node.getLeft();
            } else if(c == '-') {
                node = node.getRight();
            }
        }

        return output + node.getElement();
    }

    /**
     * Finds the location of a node and returns its path.
     * 
     * @param node The current node.
     * @param target The target node.
     * @param path The current path from root to the node.
     * 
     * @return The path to target node.
     */
    private String findPath(TreeNode<Character> node, char target, String path) {
        if (node == null) {
            return null;
        }

        // If node is target, return path
        if (target == node.getElement()) {
            return path;
        }

        // Search Left (Dot)
        String leftSearch = findPath(node.getLeft(), target, path + ".");
        if (leftSearch != null) {
            return leftSearch;
        }

        // Search Right (Dash)
        String rightSearch = findPath(node.getRight(), target, path + "-");
        if (rightSearch != null) {
            return rightSearch;
        }

        return null; // Character not in this branch
    }
}
