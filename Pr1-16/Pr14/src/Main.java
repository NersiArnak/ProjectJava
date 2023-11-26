import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi2");
        al.add("Hi3");

        BoundedWaitList<String> bwl = new BoundedWaitList<>(4);
        bwl.add("foo");
        bwl.add("foo2");
        bwl.add("bar");
        bwl.add("bar2");
        System.out.println(bwl);
    }
}