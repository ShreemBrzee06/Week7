package stringmidweekhw;

import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the
//screen.
public class Q1
{
    public static void main(String[] args)
    {
        averagevalue();
    }

    public static void averagevalue()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i =0; i<10;i++)
        {
            System.out.println("Please enter the number:(This will take 10 integer): ");
            int num = sc.nextInt();
            sum+=num;

        }
        double average = (double) sum/10;
        System.out.println("The average value is:" + average);
    }

}
