package File_Handling;

import java.io.File;

public class File01 {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Lenovo/OneDrive/Desktop/2nd Year 2nd Semester/Person");
        dir.mkdir();
        File dir2 = new File("Person2");
        dir2.mkdir();
        String dirlocation=  dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());

        if(dir2.delete()) {
            System.out.println(dir2.getName() + " Folder has been deleted!!!");
        }

    }

}

