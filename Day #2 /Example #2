package Encapsulation;

public class EncapTest2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId("CSE-2207");
        s1.setCgpa(3.75);

        System.out.println("Student ID: " + s1.getId());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}

public void setCgpa(double cgpa) {
    if(cgpa >= 0 && cgpa <= 4.0) {
        this.cgpa = cgpa;
    } else {
        System.out.println("Invalid CGPA");
    }
}
