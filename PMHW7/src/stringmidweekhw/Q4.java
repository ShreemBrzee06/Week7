package stringmidweekhw;

import java.util.Scanner;

// Take values of length and breadth of a rectangle from user and check if it is square or not.
public class Q4
{
    public static void main(String[] args)
    {
        Q4 m = new Q4();
        m.rectorsquare();
    }

    public void rectorsquare()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length:");
        double length = sc.nextDouble();
        System.out.println("Please enter breadth:");
        double breadth = sc.nextDouble();

        if (length==breadth){
        System.out.println("I am square");
        }else{
            System.out.println("I am rectangle");
        }
    }
}
