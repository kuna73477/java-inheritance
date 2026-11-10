public class Pigeon extends Bird {

    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight,
                  String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("eats grains");
    }

    @Override
    public void getVoice() {
        System.out.println("Coo");
    }

    public void returnHome() {
        System.out.println(getName() + " is returning to its home");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Species: " + species;
    }
}
