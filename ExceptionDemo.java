import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        try{
            if(b == 0){
                throw new ArithmeticException("Division by zero");
            }
            int res = a/b;
            System.out.println("Division result is " + res);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try{
            int arr[] = new int[5];
            arr[10] = 80;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
