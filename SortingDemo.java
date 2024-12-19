import java.sql.Array;
import java.util.Scanner;

public class SortingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array in ascending order is ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array in descending order is ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
