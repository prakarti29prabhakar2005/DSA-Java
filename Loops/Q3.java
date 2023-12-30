//Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = Math.min(num1, num2);
        while(result > 0){
            if(num1%result == 0 && num2%result == 0){
                break;
            }
            result--;
        }
        System.out.println("GCD of "+num1+" and "+num2+" is "+result);
    }
}
