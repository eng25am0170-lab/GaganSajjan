import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Student Name: " + name);
    }
}

public class StudentDetailsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Roll Number: ");
        int inputRoll = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Student Name: ");
        String inputName = scanner.nextLine();

        Student student = new Student(inputRoll, inputName);
        student.displayDetails();

        scanner.close();
    }
}
