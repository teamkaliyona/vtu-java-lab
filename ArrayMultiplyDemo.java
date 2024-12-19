/*
1. Get the array elements of 1st and 2nd array
2. Check if size match
3. Multiply arrays and display result
 */


import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultiplyDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in first array");
        int n = input.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            array1[i]=input.nextInt();
        }
        System.out.println("Enter the number of elements in second array");
        int m = input.nextInt();
        int[] array2 = new int[m];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<m;i++){
            array2[i]=input.nextInt();
        }
        if(n != m){
            System.out.println("Array multiplication not possible as size of the arrays does not match");
            return;
        }
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = array1[i] * array2[i];
        }
        System.out.println("Result array is " + Arrays.toString(result));
    }
}
