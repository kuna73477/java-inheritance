
public class Bird extends Animal {

    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight,
                String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age) {
        super(name, age);
        this.featherColor = "none";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird eats seeds and insects.");
    }

    @Override
    public void getVoice() {
        System.out.println("chirps");
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Feather color: " + featherColor;
    }
}

