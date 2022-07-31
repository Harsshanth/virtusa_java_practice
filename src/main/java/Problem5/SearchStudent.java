package Problem5;

import java.util.*;

public class SearchStudent {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = sc.next();
        System.out.println("Enter the Last Name");
        String lastName = sc.next();
        //adding few element to list
        student.add("Harsshanth S");
        student.add("Ram Lakshman");
        student.add("Ram sethu");
        //Search the element in list

        for(String str : student) {
            String arr[] = str.split(" ");
            if(firstName.compareTo(arr[0]) == 0)
                if(lastName.compareTo(arr[arr.length - 1]) == 0) {
                    System.out.println("Matched " + str + " is found");
                    System.exit(0);
                }
        }
        System.out.println("No result");

    }
}
