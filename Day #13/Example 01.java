package Array_List_Anisul;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size : "+number.size());

        //Adding Elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,50);

        Iterator itr = number.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        for(int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Size : "+number.size());
        System.out.println(number);

        //Removing Elements
        number.remove(2);
        System.out.println("Size : "+number.size());
        System.out.println(number);


    }
}
