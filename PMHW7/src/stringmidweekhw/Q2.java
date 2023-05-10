package stringmidweekhw;

import java.util.Scanner;

//Print multiplication table of 24, 50 and 29 using loop.
public class Q2
{
    public static void main(String[] args)
    {
        multiplication();
    }

    public static void multiplication(){
       Scanner n = new Scanner(System.in);
        System.out.println("Please enter number : 24 or 50 or 29 to see the multiplication table");
        int m = n.nextInt();

        for(int i = 1;i<=10;i++){
            int k = (m*i);
            System.out.println(m+"x"+ i +"="+""+ k);

        }

    }
}
