package stringmidweekhw;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your
//own method.
public class Q10 {
    public static void main(String[] args)
    {
        sum();

    }
    public static void sum()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter number one:");
        int a = n.nextInt();
        System.out.println("Please enter number two:");
        int b = n.nextInt();
        System.out.println("Sum of the numbers are: " +(a+b));

    }

}
