import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
public class Q19
{
    public static void main(String[] args)
    {
    posnegZero();
    }

    public static void posnegZero()
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int d = c.nextInt();
        if (d<0){ // parameter for -ve number
            System.out.println("The entered number is Negative number" + " "+ d);
        } else if (d>0) { // parameter for +ve number
            System.out.println("The entered number is Positive number"+" "+d);

        } else if (d==0) { //parameter for Zero
            System.out.println("The entered number is Zero: "+" "+d);

        }else {
            System.out.println("Invalid number");
        }
    }
}
