package stringmidweekhw;

import java.util.Scanner;

/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
public class Q8
{
    public static void main(String[] args)
    {
        Q8 m = new Q8();
        m.examenterance();
    }

   public void examenterance()
   {
       Scanner e = new Scanner(System.in);
       System.out.println("Please enter Number of classes held: ");
       int nch = e.nextInt();
       System.out.println("Please enter Number of classes attended: ");
       int nca = e.nextInt();
       int percentageofca = (nca*100)/nch;
       if(percentageofca>75){
           System.out.println("Your percentage of attendance is: " + percentageofca + "%");
           System.out.println("Congratulations you are allowed to sit for exam");

       }else{
           System.out.println("Your percentage of attendance is: " + percentageofca +"%");
           System.out.println("Sorry you can't sit for the exam");
       }
    }

}

