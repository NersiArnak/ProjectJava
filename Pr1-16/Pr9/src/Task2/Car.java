package Task2;

// Пример реализации интерфейса Priceable для класса Car
class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}