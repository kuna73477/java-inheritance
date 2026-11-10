public class Fish extends Animal {

    private boolean edible;

    public Fish() {
        super();
        this.edible = false;
    }

    public Fish(String name, int age, double weight,
                boolean edible) {
        super(name, age, weight);
        this.edible = edible;
    }

    public Fish(String name, int age) {
        super(name, age);
        this.edible = false;
    }

    public boolean getEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    @Override
    public void eat() {
        System.out.println("Fish eats aquatic organisms.");
    }

    @Override
    public void getVoice() {
        System.out.println("Sound of bubbles");
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Fish is edible ? " + edible;
    }
}
