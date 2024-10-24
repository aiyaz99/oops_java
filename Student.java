import java.util.Scanner;

class Stud_details {
    int marks[] = new int[3];
    String usn, name;
    Scanner sc = new Scanner(System.in);
    double sgpa;

    void getdetails() {
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks of subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("SGPA: " + calculateSGPA());
    }

    double calculateSGPA() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        sgpa = (double) totalMarks / 3;
        return sgpa;
    }
}

 class Student { 
    public static void main(String[] args) {
        Stud_details s1[] = new Stud_details[3];
        for (int j = 0; j < 3; j++) {
            s1[j] = new Stud_details();
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Enter the marks of " + (j + 1) + " student details");
            s1[j].getdetails();
        }
        for (int j = 0; j < 3; j++) {
            s1[j].display();
        }
    }
 }
