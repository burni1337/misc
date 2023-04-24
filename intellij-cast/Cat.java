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