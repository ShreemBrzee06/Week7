//Declare array and store any 5 countries and print them in console.
public class Q2 {
    //FIVE COUNTRIES NAME STATIC VARIABLE DECLARED AS GLOBALLY
    static String [] Country = {"Australia", "Bhutan", "Canada", "Dominican Republic", "Egypt"};

    public static void main(String[] args)
    {
        cname();

    }

    public static void cname()// STATIC METHOD
    {

        for (int i = 0; i<Country.length; i++) //FOR LOOP TO PRINT ARRAY VARIABLE
        {
            System.out.println(Country[i]);
        }
    }

}
