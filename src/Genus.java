public class Genus {
    private String gen;
    public Genus(String gen){
        this.gen=gen;
}

    public String getGenusName() {
        return gen;
    }

    public void setGenusName(String gen) {
        this.gen = gen;
    }

    public String toString() {
        return "Genus: " + gen + '\'';
    }
}
