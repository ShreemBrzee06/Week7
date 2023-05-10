package stringmidweekhw;

import java.util.Scanner;

/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
public class Q9
{
    public static void main(String[] args)
    {
        Q9 j = new Q9();
        j.studentExam();
    }

   public void  studentExam()
   {
       Scanner n = new Scanner(System.in);
       System.out.println("Please enter the Number of class held: ");
       int classHeld = n.nextInt();
       System.out.println("Please enter the Number of class attended:");
       int classAttended = n.nextInt();
       int percentageofCA = (classAttended*100)/classHeld;
       if (percentageofCA>75){
           System.out.println("Percentag of your attendance is: " + percentageofCA);
           System.out.println("Congratulations! you can sit for the Exam");

       } else if (percentageofCA<75) {
           Scanner m = new Scanner(System.in);
           System.out.println("Do you have medical reason? Yes or No:");
           String mr = m.nextLine();
           if(mr.equalsIgnoreCase("Yes")){
               System.out.println("Do you have medical reason? : " + mr);
               System.out.println("Yes! you can sit for the exam.Please provide medical certificate.");
           }else if (mr.equalsIgnoreCase("No")){
               System.out.println("Sorry! you can not sit for the exam.");

           }

       }

   }
}
