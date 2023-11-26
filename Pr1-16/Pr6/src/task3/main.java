package task3;

public class main {
    public static void main(String[] args) {
        System.out.println("Вывод результатов: " + "\n");
        Closet c1 = new Closet("Шкаф", "белый", "дерево", "новое", 20000, 400,200);
        c1.info();
        Closet c2 = new Closet("Шкаф","слоновая кость", "дерево", "б/у", 10000, 400,300);
        c2.info();

        Table t1 = new Table("Стол", "чёрный", "стекло", "новое", 10000, "нераздвижной");
        t1.info();
    }
}
