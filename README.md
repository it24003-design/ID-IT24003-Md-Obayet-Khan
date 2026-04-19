Date : 19/04/26
Day : #1
Topic : Class and Objects
Video Link : https://youtu.be/lWFzm8qIR1c?si=_F1GwcIaQuZ92GwW

Example #1 (About Class)
public class BasicJava {           
    public static void main(String[] args) {     
        
        System.out.println("My name is Muhammad Obayet Khan");
        System.out.println("I am from MBSTU");
        System.out.println("My ID is IT24003");
    }
    
}

Example #2 (About Object)

package OOP;
public class Student {
  String name,gender;
  int phone;
}

package OOP;
public class Test {
  Student student1;  //Declaring Object
  student1 = new Student();  //Creating an Object
  student1.name = "Md Obayet Khan";
  student1.gender = "Male";
  student1.phone = 01715******;
  System.out.println("Name : "+student1.name);
  System.out.println("Gender : "+student1.gender);
  System.out.println("Phone number : "+student1.phone);

}
  
  

