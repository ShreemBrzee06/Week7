package stringmidweekhw;

import java.util.Scanner;

//Write a program to print a string entered by user.
public class Q11
{
    public static void main(String[] args)
    {
        enteredstring();
    }

    public static void enteredstring()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String e = n.nextLine();
        System.out.println("Your entered string is: " + e);
    }
}
