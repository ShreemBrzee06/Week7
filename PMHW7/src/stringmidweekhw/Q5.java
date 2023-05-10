package stringmidweekhw;

import java.util.Scanner;

//Take two int values from user and print greatest among them.
public class Q5
{
    public static void main(String[] args)
    {
        Q5 g = new Q5();
        g.greatestnum();
    }

   public void greatestnum()
   {
       Scanner k = new Scanner(System.in);
       System.out.println("Please enter your first integer:");
       int l = k.nextInt();
       System.out.println("Please enter your second integer:");
       int m= k.nextInt();
       if (l>m){
           System.out.println("The greatest number you entered is "+l);
       } else if (l<m) {
           System.out.println("The greatest number you entered is "+m);
       }else{
           System.out.println("I am an equal number: "+ l + "="+ m);
       }
   }
}
