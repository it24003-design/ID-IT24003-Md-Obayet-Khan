
package Encapsulation;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

package Encapsulation;

public class Encaptest {
    public static void main(String[] args) {
        Person p1 =  new Person();
        p1.setName("Obayet");
        System.out.println(p1.getName());
        p1.setAge(22);
        System.out.println(p1.getAge());

    }
}
