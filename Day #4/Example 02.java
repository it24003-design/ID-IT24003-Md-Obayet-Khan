package Inheritance;

public class Person {
    String Name;
    int age;

    void DisplayInformation1() {
        System.out.println("Name : "+Name);
        System.out.println("Age : "+age);
    }
}

package Inheritance;

public class Teacher extends Person {
    //Name,age,DisplayInformation
    String Qualification;
    void DisplayInformation2() {
        /*System.out.println("Name : "+Name);
        System.out.println("Age : "+age);*/
        DisplayInformation1();
        System.out.println("Qualification : "+Qualification);
    }
}

package Inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.Name = "Md Aminul Islam";
        t1.age = 55;
        t1.Qualification = "Msc. in Physics";
        t1.DisplayInformation2();

        Teacher t2 = new Teacher();
        t2.Name = "Dilip Chandra Karmaker";
        t2.age = 60;
        t2.Qualification = "Msc. in Math";
        t2.DisplayInformation2();

    }
}

