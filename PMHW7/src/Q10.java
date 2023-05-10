import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
public class Q10
{
    public static void main(String[] args)
    {
    sales();
    }

    public static void sales()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter sales id");
        int s = scan.nextInt();// sale id
        System.out.println("Please enter Seller's Name");
        String sname = scan.next();// Seller Name
        System.out.println("Please enter sales amount");
        double samnt = scan.nextInt();// sale amount
        System.out.println("Please enter basic salary");
        int bsalary = scan.nextInt();// basic salary
        if(samnt>= 50000) // if loopused to give result depending on the values entered by the user.
        {
            System.out.println("Congratulation you have earned 35% of commision");
            System.out.println("Your This month salary is: " +" "+(bsalary+(samnt*35)/100));

        } else if (samnt>=30000)
        {
            System.out.println("Congratulation you have earned 20% of commision");
            System.out.println("Your This month salary is: " +" "+(bsalary+(samnt*20)/100));
        } else if (samnt>=20000)
        {
            System.out.println("Congratulation you have earned 10% of commision");
            System.out.println("Your This month salary is: " +" "+(bsalary+(samnt*10)/100));
        } else if (samnt>=10000)
        {
            System.out.println("Congratulation you have earned 5% of commision");
            System.out.println("Your This month salary is: " +" "+(bsalary+(samnt*5)/100));
        } else if (samnt<10000)
        {
            System.out.println("Congratulation you have earned 2% of commision");
            System.out.println("Your This month salary is: " +" "+(bsalary+(samnt*2)/100));
        }
        else{
            System.out.println("Please work hard next time");
        }

    }

}
