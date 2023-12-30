//Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        int sum = 0; 

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of n numbers is : "+sum);
    }
}
