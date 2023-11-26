package Task1;
import Task1.Nameable;

// Реализация интерфейса Nameable для класса Car

class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}