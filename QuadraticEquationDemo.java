/*
1. Get user inputs for a, b, c
2. Calculate discriminant value
3. Calculate roots based on if-else conditions
 */

import java.util.Scanner;

public class QuadraticEquationDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();

        double disc = b*b - 4*a*c;

        if(disc == 0){
            System.out.println("Roots are equal");
            double root = -b / 2*a;
            System.out.println("Root value is " + root);
        } else if(disc > 0){
            System.out.println("Roots are real and distinct");
            double r1 = (-b+Math.sqrt(disc))/2*a;
            double r2 = (-b-Math.sqrt(disc))/2*a;
            System.out.println("Roots are " + r1 + " and " + r2);
        }else {
            System.out.println("Roots are complex and imaginary");
            double realp = -b/2*a;
            double imagp = Math.sqrt(-disc)/2*a;
            System.out.format("Root1 is %.2f+%.2fi\n", realp,imagp);
            System.out.format("Root2 is %.2f-%.2fi\n", realp,imagp);
        }


    }
}










