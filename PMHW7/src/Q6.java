import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
| Salary Slip |
| |
| |
| Employee Id : 2564 |
| Employee Name : Jay |
|
|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|
|
| Gross Salary : 26750.0 |
|===========================|*/
public class Q6
{

    public static void main(String[] args)
    {
        wap();
    }

    public static void wap()
    {
        Scanner n = new Scanner(System.in); // scanner method
        System.out.println("Please enter employee id beginning with 25 :");//employee id
        int empid = n.nextInt();
        System.out.println("Please enter your name:");// employee name
        String empname = n.next();
        System.out.println("Please enter your basic salary :");// basic salary
        double bsalary = n.nextDouble();
         double HRA = (bsalary*10)/100; // local variable for HRA
         double DA = (bsalary*8)/100;// local variable for DA
         double TA = (bsalary*9)/100;// local variable for TA
         double PF = (bsalary*20)/100;// local variable for PF
         double grosssalary = (bsalary+ HRA +DA+TA) - PF; // // local variable for Gross salary
        System.out.println("----------------------------------");
        System.out.println("|          Salary Slip          |");
        System.out.println("|                               |");
        System.out.println("----------------------------------");
        System.out.println("|                                |");
        System.out.println("|Employee Id  :" +" "+ empid +"      |");
        System.out.println("|Employee Name: "+ empname +"         |");
        System.out.println("|Basic Salary :" + bsalary +"        |");
        System.out.println("|HRA 10%      :" + HRA+"            |");
        System.out.println("|TA 8%        :" + TA+ "           |");
        System.out.println("|DA 9%        :" + DA+"            |");
        System.out.println("|PF - 20&     :" +PF+"          |");
        System.out.println("----------------------------------");
        System.out.println("|                               |");
        System.out.println("|Gross Salary  :" + grosssalary +"       |");
        System.out.println("----------------------------------");



    }
}
