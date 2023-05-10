import java.util.Arrays;

//
public class Q20
{
    public static void main(String[] args)
    {
        intStringquestion();
    } // main method

    public static void intStringquestion()
    {
        int mynum [] ={9,5,8,6,3,2,1,7,4}; // array for numbers
        String myWord[]={"Krishna","Ganesha","Kartika","Ram","Sita","Laxmi"}; // array for strings
        System.out.println("The orginial Array is "+ Arrays.asList(myWord));
        Arrays.sort(myWord);
        System.out.println("The sorted Array is " + Arrays.asList(myWord));
        System.out.println("The original Array is " + Arrays.toString(mynum));
        Arrays.sort(mynum);
        System.out.println("The sorted Array is " + Arrays.toString(mynum));
    }
}
