import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileOutputStream fout =
                    new FileOutputStream("test.txt");

            String s = "Hello Java";

            byte b[] = s.getBytes();

            fout.write(b);

            fout.close();

            System.out.println("Done");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
