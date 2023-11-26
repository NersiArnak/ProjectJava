package task3;

import java.util.ArrayList;
public abstract class Furniture {
    private String type_of_furniture;
    private String color;
    private String material;
    private String state;
    private int price;

    public String getType_of_furniture(){
        return type_of_furniture;
    }
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }

    public String getState(){
        return state;
    }

    public int getPrice(){
        return price;
    }

    public Furniture(String type_of_furniture, String color, String material, String state, int price) {
        this.type_of_furniture=type_of_furniture;
        this.color=color;
        this.material=material;
        this.state=state;
        this.price=price;
    }

    public abstract void info();
}


class Closet extends Furniture{
    private int height;
    public int getHeight(){
        return height;
    }
    private int width;
    public int getWidth(){
        return width;
    }

    public Closet(String type_of_furniture, String color, String material, String state, int price, int height, int width) {
        super(type_of_furniture, color, material, state, price);
        this.height=height;
        this.width=width;
    }

    public void info(){
        System.out.println(getType_of_furniture() + "  -  Цвет: " + getColor() + ", " + "материал: " +getMaterial() + ", " + "состояние : " + getState()  + ", " + "цена: " + getPrice() + "p, " + "высота: " + height + "см, " + "ширина: " + width + "см");
    }

}


class Table extends Furniture {
    private String view;

    public String getView(){
        return view;
    }

    public Table(String type_of_furniture, String color, String material, String state, int price, String view) {
        super(type_of_furniture, color, material, state, price);
        this.view=view;
    }
    public void info(){
        System.out.println(getType_of_furniture() + "  -  Цвет: " + getColor() + ", " + "материал: " +getMaterial() + ", " + "состояние : " + getState()  + ", " + "цена: " + getPrice() + "p, " + "вид: " + view);
    }
}

