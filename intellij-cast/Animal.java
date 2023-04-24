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