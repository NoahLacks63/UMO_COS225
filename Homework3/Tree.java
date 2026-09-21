public class Tree {
    private int idNumber;
    private int age;

    private String speciesName;

    public Tree(int idNumber, int age, String speciesName) {
        this.idNumber = idNumber;
        this.age = age;
        this.speciesName = speciesName;
    }

    /**
     * Gets the id number of the tree.
     * 
     * @return the id number of the tree
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * Gets the age of the tree.
     * 
     * @return the age of the tree
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the species name of the tree.
     * 
     * @return the species name of the tree
     */
    public String getSpeciesName() {
        return speciesName;
    }
}
