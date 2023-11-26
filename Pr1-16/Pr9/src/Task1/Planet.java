package Task1;
import Task1.Nameable;

// Реализация интерфейса Nameable для класса Planet
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}