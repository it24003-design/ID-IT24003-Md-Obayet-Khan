package InnerClass;

public class Test {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        obj1.x = 10;

        OuterClass.InnerClass obj = obj1.new InnerClass();
        obj1.Start();
    }


}

package InnerClass;

public class OuterClass {
    int x;
    class InnerClass {
        int y;
    }
    void Start() {
        System.out.println("X = "+x);
    }

}

