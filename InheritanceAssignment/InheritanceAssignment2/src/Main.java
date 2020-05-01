import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Specimen> makeList (Specimen[] animals) {
        return new LinkedList<Specimen>(Arrays.asList(animals));
    }

    public static LinkedList<Species> makeSpeciesList (LinkedList<Specimen> animals) {
        LinkedList<Species> list = new LinkedList<Species>();
        for (Specimen animal: animals) {
            list.add(animal.getTOA());
        }
        return list;
    }

    public static LinkedList<Species> makeSpecialSpeciesList (LinkedList<Species> animals) {
        LinkedList<Species> list = new LinkedList<Species>();
        boolean isExist;

        for (Species animal: animals) {
            isExist = false;
            for (Species data : list) {
                if (animal.getSpeciesName().equals(data.getSpeciesName())) {
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                list.add(animal);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Specimen[] specimen = {
                new Specimen("Lion2", 1, new Species("leo", "Panthera")),
                new Specimen("Tiger1", 2, new Species("tigris", "Panthera")),
                new Specimen("Lion1", 3, new Species("leo", "Panthera")),
                new Specimen("gorilla1", 4, new Species("gorilla", "Gorilla"))};

        System.out.println("Number of Panthera tigris: " + Species.countSpecimens(specimen, new Species("tigris", "Panthera")));
        System.out.println("Species: " + Species.listSpecies(specimen).toString());

        System.out.println();

        System.out.println("Species: " + makeSpeciesList(makeList(specimen)));
        System.out.println("Unique species: " + makeSpecialSpeciesList(makeSpeciesList(makeList(specimen))));
    }
}
