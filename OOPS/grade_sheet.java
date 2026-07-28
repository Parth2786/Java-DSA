package OOPS;

import java.util.*;

class Student {

    // Data Members
    private String name;
    private String student_class;
    private ArrayList<Integer> marks;
    private ArrayList<String> subjects;

    // Constructor
    public Student() {
        marks = new ArrayList<>();
        subjects = new ArrayList<>();
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setClass(String student_class) {
        this.student_class = student_class;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getStudentClass() {
        return student_class;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    // Calculate Average Marks
    public double getAverageMarks() {

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        if (marks.size() == 0) {
            return 0;
        }

        return (double) sum / marks.size();
    }

    // Display Details
    public void displayDetails() {

        System.out.println("\n========== Student Details ==========");

        System.out.println("Student Name  : " + getName());
        System.out.println("Student Class : " + getStudentClass());

        System.out.println("\nSubjects and Marks");

        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i) + " : " + marks.get(i));
        }

        System.out.printf("\nAverage Marks : %.2f\n", getAverageMarks());
    }
}

public class grade_sheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        // Input Name
        System.out.print("Enter Student Name : ");
        student.setName(sc.nextLine());

        // Input Class
        System.out.print("Enter Student Class : ");
        student.setClass(sc.nextLine());

        // Input Number of Subjects
        System.out.print("Enter Number of Subjects : ");
        int n = sc.nextInt();
        sc.nextLine();

        // Create ArrayLists
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        // Input Subjects and Marks
        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Subject " + (i + 1) + " Name : ");
            String subject = sc.nextLine();
            subjects.add(subject);

            System.out.print("Enter Marks : ");
            int mark = sc.nextInt();
            sc.nextLine();

            marks.add(mark);
        }

        // Set Data
        student.setSubjects(subjects);
        student.setMarks(marks);

        // Display Student Details
        student.displayDetails();

        sc.close();
    }
}