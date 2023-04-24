public class Application {

    public static void main(String[] args) {
        System.out.println("Helloooow");
    }
}

public class Animal {

    String name;

    Integer legs;

    public Animal(String name, Integer legs) {
        this.name = name;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}

public class Cat extends Animal {

    String color;
    public Cat(String name, String color) {
        super(name, 4);
        this.color = color;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", color=" + color +
                '}';
    }
}

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