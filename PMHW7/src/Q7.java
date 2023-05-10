//Write a java program to input any number and find out if it’s odd or even.

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
    oenumber();
    }
    public static void oenumber()
    {
        Scanner numb = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int number = numb.nextInt();
        numb.close();
        String result = number%2==0?"Entered number is Even number":"Entered number is Odd number";
        System.out.println(number+" "+"is"+" "+ result);


    }
}
