public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        System.out.println(tree.getPostorder());
        System.out.println(tree.getPreorder());

        String morse = tree.toMorse("The quick brown fox jumps over the lazy dog");

        System.out.println(morse);

        System.out.println(tree.toString(morse));
    }
}
