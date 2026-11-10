
public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[9];


        animals[0] = new Animal() {
            @Override
            public void eat() {}

            @Override
            public void getVoice() {}
        };

        animals[1] = new Mammal();
        animals[2] = new Dog("Max", 3, 25.5, "Male", "Labrador");

        animals[3] = new Bird("Tweety", 2, 0.5, "Yellow");
        animals[4] = new Pigeon("Perry", 1, 0.5, "Grey", "Rock Pigeon");

        animals[5] = new Fish();
        animals[6] = new Blowfish("Bubbles", 2, 1.2, true, 65);

        animals[7] = new Dog("Rocky", 4, "German Shepherd");
        animals[8] = new Pigeon();

        for (int i = 0; i < animals.length; i++) {

            System.out.println("\nAnimal " + i);
            System.out.println(animals[i]);

            animals[i].eat();
            animals[i].getVoice();
        }


        ((Mammal) animals[1]).produceMilk();

        ((Dog) animals[2]).fetch();

        ((Bird) animals[3]).fly();

        ((Pigeon) animals[4]).returnHome();

        ((Fish) animals[5]).swim();

        ((Blowfish) animals[6]).inflate();
    }
}
