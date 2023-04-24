public class Dog extends Animal {

    String breed;
    public Dog(String name, String breed) {
        super(name, 4);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}