public class GroveTester {
    public static void main(String[] args) {
        // Instantiate a grove object named Grove 1
        Grove grove = new Grove("Grove 1");

        // Print the grove object named Grove 1
        System.out.println(grove);

        // Instantiate six Tree objects of species Spruce and age 17, and add them to Grove One
        grove.plantTree(new Tree(1, 17, "Spruce"));
        grove.plantTree(new Tree(2, 17, "Spruce"));
        grove.plantTree(new Tree(3, 17, "Spruce"));
        grove.plantTree(new Tree(4, 17, "Spruce"));
        grove.plantTree(new Tree(5, 17, "Spruce"));
        grove.plantTree(new Tree(6, 17, "Spruce"));

        // Print the grove object named Grove 1
        System.out.println(grove);

        // Remove the Tree's from Grove 1 at index 2 and 4.
        grove.removeTree(2);
        grove.removeTree(4);

        // Print the grove object named Grove 1
        System.out.println(grove);

        // Instantiate one Tree object of species Maple and age 33, and add it to Grove One
        grove.plantTree(new Tree(7, 33, "Maple"));

        // Print the grove object named Grove 1
        System.out.println(grove);

    }
}
