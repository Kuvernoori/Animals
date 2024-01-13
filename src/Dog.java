class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("Dog is barking");
    }


    public void eat() {
        System.out.println("Dog is eating " + food);
    }
}