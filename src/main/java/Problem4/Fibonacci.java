package Problem4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
     List<Integer> list = new LinkedList<>();
    public static int fibonacciSerie(int count) {
        if(count == 0){
            return 0;
        }
        if(count == 1 || count == 2){
            return 1;
        }
        return fibonacciSerie(count-2) + fibonacciSerie(count-1);
    }

    public List<Integer> findSeries(int range) {
        for(int i = 0; i < range; i++){
            list.add(fibonacciSerie(i));
        }
        return list;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count:");
        int count = sc.nextInt();
        Fibonacci ob = new Fibonacci();
        ob.findSeries(count);
        System.out.println(ob.list);
    }
}
