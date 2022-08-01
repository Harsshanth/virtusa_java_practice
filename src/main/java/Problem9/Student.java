package Problem9;

public class Student {
    static int id = 0;
    String name, subject;
    int mark;

    Student(String name, String subject, int mark) {
        id = id + 1;
        this.name = name;
        this.subject = subject;
        this.mark = mark;
    }
}
