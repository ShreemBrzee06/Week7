import java.util.Scanner;

//Write a java program to get numbers from users and print whether it is positive or negative.
public class Q8 {

    public static void main(String[] args) {// main method
        positiveandNegativenos();
    }

    public static void positiveandNegativenos() { // static method
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int s = sc.nextInt(); // local variable for number
        if (s < 0 ) { // if loop to run the parameters for +ve and -ve number
            System.out.println("This is negative number ");

        } else if (s > 0) {
            System.out.println("This is positive");
        } else {
            System.out.println("Thank you for participating");
        }

    }
}
