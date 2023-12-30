//Write a Java program to check if a given string is a palindrome or not using a loop.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String inputString = scan.nextLine();
        String reverseString = "";

        for(int i=inputString.length()-1 ; i>=0 ; i--){
            reverseString += inputString.charAt(i);
        }

        if(inputString.equals(reverseString)){
            System.out.println("String is palindrome!");
        } else {
            System.out.println("Not palindrome!");
        }
    }
}
