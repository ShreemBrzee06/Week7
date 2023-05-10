import java.util.Arrays;

//Write a Java program to sum values of an array.
public class Q21
{
    public static void main(String[] args) // main method
    {
        sumarrays();
    }
    public static void sumarrays()
    {
        int m [] = {1,2,3,4,5,5,5,5};

        System.out.println("The sum of arrays are : " + "" + Arrays.stream(m).sum()); // for arrays sum




        }
    }

