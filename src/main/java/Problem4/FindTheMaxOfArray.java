package Problem4;

import java.util.Scanner;

public class FindTheMaxOfArray {
    public static int max(int arr[], int len){
        if(len <= 1)
            return arr[0];
        return Math.max(arr[len-1],max(arr,len-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the array");
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("MAX: " + max(arr,len));
    }
}
