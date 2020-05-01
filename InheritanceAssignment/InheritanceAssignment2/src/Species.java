import java.util.LinkedList;

public class Species extends Genus
{
    private String speciesName;

    public Species( String s, String g ) {
        super(g);
        setSpeciesName(s);
    }

    public void setSpeciesName(String s) { speciesName = s; }

    public String getSpeciesName() { return speciesName; }

    public static int countSpecimens ( Specimen[] animals, Species s) {
        int numOfSpecies = 0;
        for (Specimen animal : animals) {
            if (animal.getTOA().equals(s)) {
                numOfSpecies += 1;
            }
        }
        return numOfSpecies;
    }

    public static LinkedList<String> listSpecies (Specimen[] animals) {
        LinkedList<String> list = new LinkedList<String>();
        for (Specimen animal : animals) {
            if (!list.contains(animal.getTOA().getSpeciesName())) {
                list.add(animal.getTOA().getSpeciesName());
            }
        }
        return list;
    }


    public String toString() {
        return "Species: " + getGenusName() + " " + speciesName;
    }

    public boolean equals(Species s) {
        return speciesName.equals(s.getSpeciesName());
    }
}