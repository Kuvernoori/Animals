public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating " + food);
    }

    public void sleep() {
        System.out.println("Animal is sleeping ZZZZZ....");
    }
}
