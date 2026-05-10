package File_Handling;

import java.io.File;

public class File01 {
    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir();
    }
}
