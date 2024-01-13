class Horse extends Animal {
    String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }


    public void makeNoise() {
        System.out.println("Horse is neighing");
    }


    public void eat() {
        System.out.println("Horse is eating " + food);
    }
}