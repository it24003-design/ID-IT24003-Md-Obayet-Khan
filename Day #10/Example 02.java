import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");

        System.out.println(set);
    }
}
