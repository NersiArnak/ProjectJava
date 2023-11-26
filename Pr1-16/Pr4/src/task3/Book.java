package task3;

public class Book {
    private String author;

    private String title;
    private int year_publishing;

    public Book(String a, String t, int yp){
        author = a;

        title = t;
        year_publishing = yp;
    }
    public Book(String a, String t) {
        author = a;
        title = t;
        year_publishing = 0;
    }

    public Book(int yp) {
        author = "unknown";
        title = "unknown";
        year_publishing = yp;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear_publishing(int year_publishing) {
        this.year_publishing = year_publishing;
    }

    public String getAuthor(String author) {
        return author;
    }

    public String getTitle(String title) {
        return title;
    }

    public int getYear_publishing(int year_publishing) {
        return year_publishing;
    }


    public String toString(){
        return "book author - " + author + ", "+ "title - "  + title + ", " + "year of its publication - "+ year_publishing;
    }

}
