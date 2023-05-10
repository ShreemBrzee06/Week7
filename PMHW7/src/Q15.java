import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Q15
{
    public static void main(String[] args)
    {
    alporchar();
    }
    public static void alporchar()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter the value: ");
        char s1= sca.next().charAt(0);//variables to save character
            if ((s1>='a' && s1<'z')||(s1>='A' && s1<='Z')){//alphabet parameter
                System.out.println("The entered value is an Alphabet: " +" "+ s1);
            } else if (s1>='0' && s1 <='9') { // digital parameter
                System.out.println("The entered value is a digital: " + " "+s1);
            }else{
                System.out.println("The entered value is a random character: "+ " " + s1);
            }


    }
    }

