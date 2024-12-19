import java.util.Scanner;

public class ShiftOperationDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Left Shift Operation");
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Enter the number of positions: ");
        int pos = input.nextInt();
        int res = num << pos;
        System.out.println("Result of left shift operation is " + res);
        System.out.println("Right Shift Operation");
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println("Enter the number of positions: ");
        pos = input.nextInt();
        res = num >> pos;
        System.out.println("Result of right shift operation is " + res);
        if(num < 0){
            System.out.println("We observe that even after the right shift operation the sign bit of negative number is preserved. We call this as sign extention");
        }
        System.out.println("Unsigned Right Shift Operation");
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println("Enter the number of positions: ");
        pos = input.nextInt();
        res = num >>> pos;
        System.out.println("Result of unsigned right shift operation is " + res);
    }
}
