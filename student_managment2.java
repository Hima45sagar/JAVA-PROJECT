import java.util.*;

class Student {
    int roll_no;
    String name;
    String course;
    int marks;

    Student(int roll_no, String name, String course, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Roll No: " + roll_no);
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student Marks: " + marks);
        System.out.println("---------------------------------------");
    }
}

public class student_managment2 {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1 : Add Student");
            System.out.println("2 : View Students");
            System.out.println("3 : Search Student");
            System.out.println("4 : Delete Student");
            System.out.println("5 : Exit");

            int choice = scan.nextInt();

            switch (choice) {

                case 1:
                    AddStudent();
                    break;

                case 2:
                    ViewStudent();
                    break;

                case 3:
                    SearchStudent();
                    break;

                case 4:
                    DeleteStudent();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void AddStudent() {

        System.out.println("Enter Student Roll No:");
        int roll = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Student Name:");
        String name = scan.nextLine();

        System.out.println("Enter Student Course:");
        String course = scan.nextLine();

        System.out.println("Enter Student Marks:");
        int marks = scan.nextInt();

        students.add(new Student(roll, name, course, marks));

        System.out.println("Student Added Successfully!");
    }

    static void ViewStudent() {
        for (Student s : students) {
            s.display();
        }
    }

    static void SearchStudent() {

        System.out.println("Enter Student Roll No:");
        int roll = scan.nextInt();

        for (Student s : students) {
            if (s.roll_no == roll) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    static void DeleteStudent() {

        System.out.println("Enter Student Roll No:");
        int roll = scan.nextInt();

        boolean removed = students.removeIf(s -> s.roll_no == roll);

        if (removed)
            System.out.println("Student Deleted Successfully");
        else
            System.out.println("Student Not Found");
    }
}

