import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetailsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        System.out.println("Enter the number of students");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter student details");
            System.out.println("USN: ");
            String usn = input.next();
            System.out.println("Name: ");
            String name = input.next();
            System.out.println("Branch: ");
            String branch = input.next();
            System.out.println("Phone number: ");
            String phone = input.next();
            System.out.println("Percentage: ");
            double percentage = input.nextDouble();
//            Student st = new Student(usn,name,branch,phone, percentage);
//            studentList.add(st);
            studentList.add(new Student(usn,name,branch,phone, percentage));
        }
        System.out.println("Student Details");
        System.out.println("---------------------------------------------------------");
        System.out.println("USN \t\t Name \t\t Branch \t Phone \t Percentage");
        for(Student st : studentList){
            System.out.println(st.getUsn() + "\t" + st.getName() + "\t\t" + st.getBranch() + "\t\t" + st.getPhone() + "\t" + st.getPercentage());
        }

    }
}
