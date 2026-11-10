public class Blowfish extends Fish {

    private int teethCounter;

    public Blowfish(){
        super();
        this.teethCounter = 65;
    }

    public Blowfish(String name, int age, double weight,
                    boolean edible, int teethCounter) {
        super(name, age, weight, edible);
        this.teethCounter = teethCounter;
    }

    public Blowfish(String name, int age, int teethCounter) {
        super(name, age);
        this.teethCounter = teethCounter;
    }

    public int getTeethCounter() {
        return teethCounter;
    }

    public void setTeethCounter(int teethCounter) {
        this.teethCounter = teethCounter;
    }

    @Override
    public void eat() {
        System.out.println("Blowfish eats");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish makes blowfish sounds");
    }

    public void inflate() {
        System.out.println(getName() + " inflates its body");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Number of Teeth " + teethCounter;
    }
}


