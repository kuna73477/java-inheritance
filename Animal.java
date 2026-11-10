public abstract class Animal {

    private String name;
    private int age;
    private double weight;

    // Default constructor
    public Animal() {
        this.name = "none";
        this.age = 0;
        this.weight = 0.0;
    }

    // Constructor with all parameters
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();

    public abstract void getVoice();

    @Override
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", Weight: " + weight + " kg";
    }
}
