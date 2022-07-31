package Problem5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppendTwoList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        System.out.println("Enter the size of List 1");
        int sizeOfList1 = sc.nextInt();
        System.out.println("Enter the size of List 2");
        int sizeOfList2 = sc.nextInt();
        System.out.println("Enter the list1 Item");
        for(int i = 0; i < sizeOfList1; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println("Enter the list 2 item");
        for(int i = 0; i < sizeOfList2; i++) {
            list2.add(sc.nextInt());
        }

        //Appending

        for(int i : list2) {
            boolean flag = false;
            for(int j : list1){
                if(i == j) {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                list1.add(i);
        }
        System.out.println(list1);

    }

}
