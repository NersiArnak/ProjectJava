package Task1;
import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n,  char g, String e) {
        name = n;
        email = e;
        gender = g;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }

    public char getGender(char gender) {
        return gender;
    }

    public String toString() {
        return name+"("+gender+")"+ " at "+ email;
    }
}
