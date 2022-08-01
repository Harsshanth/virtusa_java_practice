package Problem7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;

import Log.Log;


public class TreeSetProblem {
    public static void main(String[] args) throws IOException {

        String url = "E:\\Personal Work\\zoho\\Virtusa\\src\\Problem7\\StudentDetails";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(url));
        } catch (Exception e) {
            Log log = new Log("TreeSetLogger");
            log.logger.setLevel(Level.WARNING);
            log.logger.info("Info msg");
            log.logger.warning("Warning msg");
            log.logger.severe("Severe msg");
        }

        Set<String> set = new TreeSet<>();
        String line = "";
        while((line = reader.readLine()) != null){
            set.add(line);
        }
        for(String i : set)
            System.out.println(i + " ");
    }
}
