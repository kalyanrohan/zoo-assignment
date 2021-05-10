import java.util.Collections;
import java.util.LinkedList;

public class Specimen {
    private String name;
    private int cageNumber;
    private Species toa; // "Type Of Animal"
    public Specimen( String a, int c, Species s)
    {
        setName(a);
        setCage(c);
        setTOA(s);
    }
    LinkedList makeList(Specimen[] animals){
        LinkedList<Specimen>specimen=new LinkedList<>();
        Collections.addAll(specimen, animals);
        return specimen;
    }

    public void setName(String a){ name = a; }
    public void setCage(int c){ cageNumber = c; }
    public void setTOA(Species s){ toa = s; }
    public String getName(){ return name; }
    public int getCage(){ return cageNumber; }
    public Species getTOA(){ return toa; }
    public String toString()
    {
        return name + " is a " + toa + " in cage " + cageNumber;
    }

    public LinkedList<Species> makeSpeciesList( LinkedList<Specimen> animals ){
        LinkedList<Species>speciesList=new LinkedList<>();
        for (Specimen animal : animals) {
            speciesList.add(animal.getTOA());
        }
        return speciesList;
    }
}
