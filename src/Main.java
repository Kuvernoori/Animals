public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Meat", "Home", "Siba-Inu"),
                new Cat("Fish", "Apartment", "White-gray"),
                new Horse("Hay", "Stable", "Thoroughbred")
        };

        Veterinary vet = new Veterinary();
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}