import java.util.Scanner;
/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)/

 */
public class Q1 {// syntax for ternary operator is - condition?true:false
    public static void main(String[] args)
    {
        oenum();

    }
    public static void oenum()
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter a number:" );//scanner method
        int num = n.nextInt();
        n.close();// to close the writer//
        String result= num%2==0?"Even Number":"Odd Number"; //ternary operator stored in string
        System.out.println(num+" "+"is"+" "+ result); //output
    }
}


