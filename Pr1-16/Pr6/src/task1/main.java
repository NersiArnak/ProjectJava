package task1;

public class main {
    public static void main(String[] args) {
        System.out.println("Вывод результатов:" + "\n");
        Plate p1 = new Plate("Белый", "керамика", 500, "for soup");
        p1.info();
        Plate p2 = new Plate("Синий", "керамика", 310, "snack plates");
        p2.info();

        Сutlery c1 = new Сutlery("Золотой", "позолоченное серебро", 100, "fork");
        c1.info();

    }
}
