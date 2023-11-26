package task1;

public abstract class Dish {
    private String color;
    private String material;
    private int price;

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice(){
        return price;
    }
    public Dish(String color, String material, int price) {
        this.color= color;
        this.material=material;
        this.price = price;
    }
    public abstract void info();
}

class  Plate extends Dish{
    private String types_of_plates;
    public Plate(String color, String material, int price, String types_of_plate) {
        super(color, material, price);
        this.types_of_plates=types_of_plate;
    }
    public void info(){
        System.out.println("Цвет: " + super.getColor() + ", " + "материал: " + super.getMaterial() + ", " + "цена: " +super.getPrice() + "р, " + "вид тарелки: " + types_of_plates);
    }
}

class Сutlery extends Dish{
    private String view;
    public Сutlery(String color, String material, int price, String view){
        super(color, material, price);
        this.view=view;

    }
    public void info(){
        System.out.println("Цвет: " + super.getColor() + ", " + "материал: " + super.getMaterial() + ", " + "цена: " +super.getPrice() + "р, " + "какой прибор: " + view);
    }
}
