package Speed;
import java.util.Scanner;

public class StudentInfoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentInfo student = new StudentInfo();
        
        System.out.print("Enter student's first name: ");
        student.setFirst(scanner.next());
        System.out.print("Enter student's middle name: ");
        student.setMiddle(scanner.next());
        System.out.print("Enter student's last name: ");
        student.setLast(scanner.next());
        System.out.print("Enter student's suffix: ");
        student.setSuffix(scanner.next());
        
        // Print the student's full name
        System.out.println("First Name: " + student.getFirst());
        System.out.println("Middle Initial: " + student.getMiddle());
        System.out.println("Last Name: " + student.getLast());
        System.out.println("SFX: " + student.getSuffix());
        System.out.println("Student's Full Name: " + student.getFullName());
    }
}
