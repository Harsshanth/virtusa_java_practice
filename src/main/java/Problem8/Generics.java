package Problem8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Generics {

    //Lower Bound
    public static void addElements(List<? super Number> list) {
        list.add(1);
        list.add(5.6);
        list.add(2l);
    }

    //Upper Bound
    public static double sumOfList (List<? extends  Number> elements){
        double sum = 0.0;
        for(Number number : elements ) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List list = new ArrayList<Number>();
        addElements(list);
        System.out.println("Sum:" + sumOfList(list));

    }
}
