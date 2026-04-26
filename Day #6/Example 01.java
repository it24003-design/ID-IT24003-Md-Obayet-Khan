package Abstruction;

public abstract class MobileUser {
    abstract void SendMassage();
}

package Abstruction;

public class Rahim extends MobileUser {
    void SendMassage() {
        System.out.println("Hi!, I am Obayet");
    }
}

package Abstruction;

public class Karim extends MobileUser{
    @Override
    void SendMassage() {
        System.out.println("hi! i am karim");

    }
}

package Abstruction;

public class Test {
    public static void main(String[] args) {
        MobileUser ms;

        ms = new Karim();
        ms.SendMassage();

        ms = new Rahim();
        ms.SendMassage();
    }
}

