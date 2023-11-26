package task3;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<Furniture>();
    }

    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    public void showInventory() {
        for (Furniture furniture : inventory) {
            furniture.info();
        }
    }
}