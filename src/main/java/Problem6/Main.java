package Problem6;

import java.util.*;


public class Main {

    public static void search(Map<Integer, Students> studentsMap, String name, String email){
        for(Map.Entry<Integer,Students> students : studentsMap.entrySet()) {
            if(students.getValue().getName().compareTo(name) >= 0 ) {
                if (students.getValue().getEmail().compareTo(email) >= 0)
                    System.out.println("Found the element " + name + " " + email);
                return;
            }
        }
        System.out.println("No element present");
        return;
    }

    public static void fetch(Map<Integer, Students> studentsMap, int key){
        System.out.println("Name: " + studentsMap.get(key).getName() + "\n" + "Email: "
                + studentsMap.get(key).getEmail());
    }
    public static Map<Integer, Students> sort(Map<Integer, Students> studentsMap){
        Map<Integer,Students> ans = new HashMap<Integer, Students>();
        Students[] obj = new Students[studentsMap.size()];
        int i = 0;
        for(Map.Entry<Integer,Students> students : studentsMap.entrySet()) {
            obj[i] = students.getValue();
            i++;
        }
        Arrays.sort(obj);
        i = 0;
        for(Students ob : obj) {
            ans.put(i,ob);
            i++;
        }
        return ans;
    }


    public static void main(String[] args) {
        Map<Integer,Students> mapStudent = new HashMap<Integer, Students>();
        Students student1 = new Students();
        student1.name = "Harsshanth";
        student1.email = "Harsshanth@gmail.com";
        mapStudent.put(1,student1);
        Students student2 = new Students();
        student2.name = "Sethu";
        student2.email = "sethu@gmail.com";
        mapStudent.put(2,student2);
        Students student3 = new Students();
        student3.name = "Harssh";
        student3.email = "Harssh@gmail.com";
        mapStudent.put(3,student3);
        fetch(mapStudent,2);
        search(mapStudent , "Harsshanth", "Harsshanth@gmail.com");
        mapStudent = sort(mapStudent);
        System.out.println(mapStudent);

    }
}
