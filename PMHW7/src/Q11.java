import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any
//other alphabet should be invalid entry.
public class Q11 {
    public static void main(String[] args)
    {
         city();
    }

    public static void city()// static method
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Please enter valid alphabet from A to F:");
        String alphabet = c.next().toUpperCase();
        if(alphabet.equals("A"))
        {
            System.out.println("City name is: Aberdeen");

        } else if (alphabet.equals("B"))
        {
            System.out.println("City name is: Birmingham");
        } else if (alphabet.equals("C"))
        {
            System.out.println("City name is: Cambridge");
        } else if (alphabet.equals("D"))
        {
            System.out.println("City name is: Devon");
        } else if (alphabet.equals("E"))
        {
            System.out.println("City name is: Edinburgh");
        } else if (alphabet.equals("F"))
        {
            System.out.println("City name is: Forestgate");
        }else {
            System.out.println("Invalid entry");

        }

    }
}
