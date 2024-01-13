class Cat extends Animal {
    String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }


    public void makeNoise() {
        System.out.println("Cat is meowing");
    }

    public void eat() {
        System.out.println("Cat is eating " + food);
    }
}