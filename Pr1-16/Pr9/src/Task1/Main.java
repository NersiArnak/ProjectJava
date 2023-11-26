package Task1;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable animal = new Animal("Lion");
        Nameable car = new Car("Toyota");

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Animal name: " + animal.getName());
        System.out.println("Car name: " + car.getName());
    }
}
