public class Genus {
    private String genusName;

    public Genus(String genusName) {
        this.genusName = genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String getGenusName() {
        return this.genusName;
    }

    @Override
    public String toString() {
        return "Genus: " + this.genusName;
    }
}