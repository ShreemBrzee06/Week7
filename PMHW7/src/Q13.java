import java.util.Scanner;

//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
//find addition, Subtraction, multiplication and division according to their symbol(using if else)
public class Q13 {

    public static void main(String[] args)
    {
    operators();
    }

    public static void operators()//static method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double num= sc.nextDouble(); // local variable for number
        System.out.println("Please enter another number:");
        double num1 =sc.nextDouble(); // local variable for number
        System.out.println("Please enter valid operators: (+,-,*,/) ");
        char operator = sc.next().charAt(0); // local variable to save operator
        double a = num+num1,b = num-num1,c=num *num1, d= num/num1; // variables to save operations
        if(operator=='+') // if loop to show the operator chosen by the user
        {
            System.out.println("The addition of numbers are: " + a);

        } else if (operator=='-')
        {
            System.out.println("The subtraction of numbers are: " + b);
        } else if (operator=='*')
        {
            System.out.println("The Multiplication of numbers are: " + c);
        } else if (operator=='/')
        {
            System.out.println("The Division of numbers are: " + d);

        } else {
            System.out.println("Invalid entry");

        }


    }

}
