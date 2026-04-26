package Polymorphisms;

public class Person {
    void Display() {
        System.out.println("I am Obayet");
    }
}

package Polymorphisms;

public class Teacher extends Person {
    @Override
    void Display() {
        System.out.println("I am a Teacher");
    }
}

package Polymorphisms;

public class Student extends Person {
    void Display() {
        System.out.println("I am a student");
    }

}

package Polymorphisms;

public class Test {
    public static void main(String[] args) {
        Person P = new Person();
        P.Display();
        P = new Teacher();
        P.Display();
        P = new Student();
        P.Display();
    }
}

