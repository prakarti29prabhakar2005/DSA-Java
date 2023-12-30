//Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2 ; i<n ; i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
