package Task2;

public class Main {
    public static void main(String[] args) {
        // Создание объектов и вызов метода getPrice()
        Book book = new Book("The Great Gatsby", 15.99);
        Car car = new Car("Toyota Camry", 25000.0);
        Product product = new Product("Smartphone", 599.99);

        System.out.println("Book price: $" + book.getPrice());
        System.out.println("Car price: $" + car.getPrice());
        System.out.println("Product price: $" + product.getPrice());
    }
}
