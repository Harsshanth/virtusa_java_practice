package Problem4;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSerie(int count) {
        if(count == 0){
            return 0;
        }
        if(count == 1 || count == 2){
            return 1;
        }
        return fibonacciSerie(count-2) + fibonacciSerie(count-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count:");
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println(fibonacciSerie(i) + " ");
        }
    }
}
