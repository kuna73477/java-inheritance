
public class Mammal extends Animal {

    private String sex;

    public Mammal() {
        super();
        this.sex = "none";
    }

    public Mammal(String name, int age, double weight, String sex) {
        super(name, age, weight);
        this.sex = sex;
    }

    public Mammal(String name, int age) {
        super(name, age);
        this.sex = "none";
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes a sound.");
    }

    public void produceMilk() {
        if(this.sex.equals("female")) {
            System.out.println("produces milk");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Sex: " + sex;
    }
}
