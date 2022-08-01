package Problem9;

import Log.Log;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class Main implements Runnable{
    static BufferedReader br;
    public static List<Student> list = new LinkedList<Student>();

    private synchronized void readCsv() throws SecurityException, IOException {
        String line = "";
        String splitBy = ",";
        try {
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] student = line.split(splitBy);    // use comma as separator
                System.out.println(Arrays.asList(student));
                Student ob = new Student(student[0], student[1], Integer.parseInt(student[2]));
                list.add(ob);
            }
        }catch (Exception e) {
            Log log = new Log("ThreadLogger");
            log.logger.setLevel(Level.WARNING);
            log.logger.info("Info msg");
            log.logger.warning("Warning msg");
            log.logger.severe("Severe msg");
            System.out.println(e);
        }
    }
    private synchronized void estimateGrade() {
        File file = new File("E:\\Personal Work\\zoho\\Virtusa_java_practise\\src\\main\\java\\Problem9\\result.csv");
        String grade = "";
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i).mark >= 80)
                    grade = "Distinction";
                else if(list.get(i).mark >= 40 && list.get(i).mark < 80)
                    grade = "Pass";
                else
                    grade = "fail";
                bw.write(list.get(i).name + "," + list.get(i).subject+ "," + list.get(i).mark + "," + grade);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e){

        }
    }
    public static void main(String[] args)  throws SecurityException, IOException {
        Main obMain = new Main();
        Thread thread = new Thread(obMain);
        try{
             br = new BufferedReader(new FileReader("E:\\Personal Work\\zoho" +
                    "\\Virtusa_java_practise\\src\\main\\java\\Problem9\\file.csv"));

        } catch (Exception e) {
            Log log = new Log("ThreadLogger");
            log.logger.setLevel(Level.WARNING);
            log.logger.info("Info msg");
            log.logger.warning("Warning msg");
            log.logger.severe("Severe msg");
            System.out.println(e);
        }
        thread.start();
        for(int i = 0; i < list.size()-1; i++) {
            System.out.println(list.get(i).mark);
        }

    }

    @Override
    public void run() {
        try {
            readCsv();
            estimateGrade();        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
