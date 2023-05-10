import java.util.Scanner;
/*Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd*/
public class Q26
{
    public static void main(String[] args)
    {
        rev();
    }
    public static void rev ()
    {   Scanner n = new Scanner(System.in);
        System.out.println("Please enter your string");
        String w = n.nextLine();
        String reverse = new StringBuffer(w).reverse().toString();
        System.out.println("The original string: " + w);
        System.out.println("The reverse of the above string is: " +reverse);

    }
}
