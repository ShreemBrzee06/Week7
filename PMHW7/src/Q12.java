import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly  ifany
//other alphabet should be invalid entry. using SWITCH  statement
public class Q12
{
    public static void main(String[] args)// main method
    {
        cityName();
    }
    public static void cityName() // static method
    {
        Scanner city = new Scanner(System.in);
        System.out.println("Please enter city name from A to F: ");
        String cname = city.next();
        char cn = cname.toUpperCase().charAt(0);

        switch (cn) // switch case written as per the alphabets A to F
        {   case 'A':
            System.out.println("City name is: Aberdeen");
            break;
            case 'B':
            System.out.println("City name is: Birmigham");
            break;
            case 'C':
            System.out.println("City name is: Cambridge");
            break;
            case 'D':
            System.out.println("City name is: Devon");
            break;
            case 'E':
            System.out.println("City name is: Edinburgh");
            break;
            case 'F':
            System.out.println("City name is: Forest Gate");
            break;
            default: {
                System.out.println("Invalid Input");// other alphabet is invalid entry

            }


        }

    }

}
