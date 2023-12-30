//Write a Java program to print a multiplication table for a given number 'n'.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();

        for(int i=1 ; i<=10 ; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
