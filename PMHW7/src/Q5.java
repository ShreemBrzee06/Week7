import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
|
|

Mark Sheet

|
|

|
|
|
Name
Roll No

: 08
: 23

J
a
y
|
|
|
| |
| Subjects : Marks |
| |
| Math : 98 |
| Science: : 90 |
| English : : 85 |
| |
| Total : 273 |
| |
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
| |*/
public class Q5 {
    public static void main(String[] args)// main method
    {
        ms(); // when I use negative value twice method doesn't work. Need advice on that.
    }

    public static void ms()// static method
    {
        Scanner s = new Scanner(System.in);// scanner class declared
        System.out.println("Enter your Name:"); // called name
        String Name = s.nextLine();
        System.out.println("Enter your Roll No:");// Called Rollno
        int RN = s.nextInt();
        System.out.println("Enter marks for Maths: "); // asking user to put Maths marks
        //Invalid statement for Maths marks
        int mths = s.nextInt();
        if (mths >= 0 && mths <= 100) {
            System.out.println(mths);
        } else{
            System.out.println("Enter valid marks between 0 to 100");
            System.out.println("Enter marks for Maths:");
            s.nextInt();
            mths = s.nextInt();}

        System.out.println("Enter marks for English : "); // asking user to put Maths marks
        //Invalid statement for English marks
        int eng = s.nextInt();
        if (eng >= 0 && eng <= 100) {
            System.out.println(eng);
        } else{
            System.out.println("Enter valid marks between 0 to 100");
        System.out.println("Enter marks for English:");
        s.nextInt();
        eng = s.nextInt();}

        System.out.println("Enter marks for Science : "); // asking user to put Science marks
        //Invalid statement for English marks
        int sci = s.nextInt();
        if (sci >= 0 && sci <= 100) {
            System.out.println(sci);
        } else{
        System.out.println("Enter valid marks between 0 to 100");
        System.out.println("Enter marks for Science:");
        s.nextInt();
        sci = s.nextInt();}

        int total = mths + eng + sci;
        double percentage = (double) total / 3;

        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("|-------------------------------------------------|");
        System.out.println("                    Mark Sheet                     ");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|Name: " + Name + "                                 |");
        System.out.println("|Roll No: " + RN +"                                 |");
        System.out.println("--------------------------------------------------|");
        System.out.println("Subject      |      Marks      |      Grade       |");
        System.out.println("---------------------------------------------------");
        System.out.println("Math         |        " + mths+ "       |        " + grade+" |");
        System.out.println("Science      |        " + sci + "       |        " + grade+" |");
        System.out.println("English      |        " + eng + "       |        " + grade+" |");
        System.out.println("----------------------------------------------------------|");
        System.out.println("Total Marks  |        " + total + "       |         " + grade+" |");
        System.out.println("Percentage   |        " + percentage + "  |        " + grade+" |");
        System.out.println("Result       |        " + result);
        System.out.println("-------------------------------------------------|");


    }
}







