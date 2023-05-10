package stringmidweekhw;

import java.util.Scanner;

/*
* A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/
public class Q6
{
    public static void main(String[] args)
    {
        Q6 j = new Q6();
        j.marks();
    }

    public void marks()
    {
        Scanner f = new Scanner(System.in);
        System.out.println("Please enter your marks :");
                int h = f.nextInt();
        if (h>80)
        {
            System.out.println("Congratulations your Grade is 'A' ");
        } else if (h<60 && h>80)
        {
            System.out.println("Congratulations your Grade is 'B' ");
        } else if (h<50 && h>60)
        {
            System.out.println("Congratulations your Grade is 'C' ");
        } else if (h<45 && h>50)
        {
            System.out.println("Your Grade is 'D' ");
        } else if (h<25 && h>45)
        {
            System.out.println("Your Grade is 'E");
        } else  {
            System.out.println("Your Grade is 'F'");
        }
    }
}
