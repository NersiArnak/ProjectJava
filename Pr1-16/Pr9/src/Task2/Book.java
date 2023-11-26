package Task2;

// Пример реализации интерфейса Priceable для класса Book
class Book implements Priceable {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}