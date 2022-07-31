package Problem7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProblem {
    public static void main(String[] args) throws IOException {
        String url = "E:\\Personal Work\\zoho\\Virtusa\\src\\Problem7\\StudentDetails";
        BufferedReader reader = new BufferedReader(new FileReader(url));
        Set<String> set = new TreeSet<>();
        String line = "";
        while((line = reader.readLine()) != null){
            set.add(line);
        }
        for(String i : set)
            System.out.println(i + " ");
    }
}
