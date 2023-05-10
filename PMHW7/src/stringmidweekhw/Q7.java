package stringmidweekhw;

import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among
//them.
public class Q7
{
    public static void main(String[] args)// main method
    {
        Q7 s = new Q7(); // object
        s.identifytheage();
    }

    public void identifytheage() // Instance method
    {
        Scanner i = new Scanner(System.in); // Scanner class
        System.out.println("(User no:1)Please enter your age:");
        int usern01age = i.nextInt();
        System.out.println("(User no:2)Please enter your age:");
        int userno2age = i.nextInt();
        System.out.println("(User no:2)Please enter your age:");
        int userno3age = i.nextInt();
        if(usern01age<0 || userno2age<0|| userno3age<0){
            System.out.println("Please enter valid age");
        }
        else if(usern01age<userno2age || userno2age<userno3age){
            System.out.println("The oldest age is: " + userno3age);
            System.out.println("The youngest age is:" +usern01age);

        } else if (userno2age<usern01age|| usern01age<userno3age) {
            System.out.println("The oldest age is: " + userno3age);
            System.out.println("The youngest age is: " +userno2age);

        } else if (userno3age<userno2age || userno2age<usern01age) {
            System.out.println("The oldest age is: " +usern01age);
            System.out.println("The youngest age is: "+ userno3age);

        } else if (userno3age<usern01age ||usern01age<userno2age) {
            System.out.println("The oldest age is: "+ userno2age);
            System.out.println("The youngest age is: "+ userno3age);
        }else if(usern01age==userno2age|| userno2age ==userno3age){
            System.out.println("All the users are of same age");
        }else{
            System.out.println("Please enter valid age number");
        }
    }
}
