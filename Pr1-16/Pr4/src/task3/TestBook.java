package task3;

import task3.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("A.S. Pushkin", "The Tale of Tsar Saltan",1900);
        Book b2 = new Book("Daniel Keyes", "Flowers for Algernon");
        Book b3 = new Book(2000);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
