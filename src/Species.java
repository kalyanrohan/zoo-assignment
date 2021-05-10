import java.util.*;
public class Species extends Genus {
    private String speciesName;
    public Species( String s, String g )
    {
        super(g);
        setSpeciesName(s);
    }
    public void setSpeciesName(String s){ speciesName = s; }
    public String getSpeciesName(){ return speciesName; }
    @Override
    public String toString()
    {
        return "Species: " + getGenusName() + " " + speciesName;
    }
    public boolean equals(Species s)
    {
        return speciesName.equals(s.getSpeciesName());
    }

    public int countSpecimens(Specimen[] animal, Species s){
        int counter=0;
        for (Specimen specimen : animal) {
            if (specimen.getTOA().equals(s)) {
                counter++;
            }
        }
        return counter;
    }

    public LinkedList<Species> makeSpeciesListUnique(LinkedList<Species>allSpecies){
        LinkedList<Species>UniqueSpeciesList=new LinkedList<>();
        for (Species allSpec : allSpecies) {
            if (!UniqueSpeciesList.contains(allSpec)) {
                UniqueSpeciesList.add(allSpec);
            }
        }
        return UniqueSpeciesList;
    }
}
