package Parameterise_Method;

public class Teacher {
    String name, gender;
    String phone;

    Teacher(String n, String g, String p) {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
    }
}

package Parameterise_Method;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Obayet Khan", "Male", "01715000000");
        t1.displayInformation();
    }
}
