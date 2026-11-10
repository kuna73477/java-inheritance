public class Dog extends Mammal {
        private String breed;

        public Dog() {
            super();
            this.breed = "none";
        }

        public Dog(String name, int age, double weight,
                   String sex, String breed) {
            super(name, age, weight, sex);
            this.breed = breed;
        }

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public void eat() {
            System.out.println("eats food");
        }

        @Override
        public void getVoice() {
            System.out.println("woof");
        }

        public void fetch() {
            System.out.println("Dog fetches");
        }

        @Override
        public String toString() {
            return super.toString() +
                    ", Breed: " + breed;
        }
    }


