import java.util.Scanner;

//Write if else condition and print your group name in console else others group name.
public class Q4
{
    public static void main(String[] args)
    {
        grpName();
    }
    public static void grpName()
    {
        Scanner GN = new Scanner(System.in);
        System.out.println("Please enter your Group Name:");
        String gn = GN.nextLine();

        String post="Postman";
        String Gnm= "Selenium",Grnm = "Java";

        boolean g = gn.equals("Postman");
        System.out.println(g);

        if (gn.equals(post)) {// our group name is Postman
            System.out.println("Welcome to our Postman Family study group");
        } else if (gn.equals(Gnm)) {
            System.out.println("Please join Selenium group");
        } else if (gn.equals(Grnm)){
            System.out.println("Please join Java group");
        } else{
            System.out.println("Thank you very much for joining the group");
        }
    }
  }

