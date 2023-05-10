import java.util.Scanner;

//Write a Java program which input any number between 1 to 7 and it print The Daysname
//MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
//number is out of selection Print message “Week contains 1 to 7 days”
public class Q16
{
    public static void main(String[] args)
    {
        days();
    }
    public static void days()
    {
        Scanner day = new Scanner(System.in);
        System.out.println("Please enter the number of day: ");
        char dys = day.next().charAt(0);
        switch (dys) {//expression for days
            case '1':
                System.out.println("Today is Monday");
                break;
            case '2':
                System.out.println("Today is Tuesday");
                break;
            case '3':
                System.out.println("Today is Wednesday");
                break;
            case '4':
                System.out.println("Today is Thursday");
                break;
            case '5':
                System.out.println("Today is Friday");
                break;
            case '6':
                System.out.println("Today is Saturday");
                break;
            case '7':
                System.out.println("Today is Sunday");
                break;
            default:{
                System.out.println("Week contains 1 to 7 days");}



        }
    }
}
