import java.util.Arrays;

//Write a Java program to calculate the average value of array elements.
public class Q22 {
    public static void main(String[] args) {
    averagearrays();
    }
    public static void averagearrays()
    {
        int myArrays[] = {5,3,5,3,5,6,1}; //  arrays for numbers
        int sumofmyArrays = Arrays.stream(myArrays).sum(); //variable to store
        long count = Arrays.stream(myArrays).count();
        System.out.println("The count of total arrays: "+" "+count);
        System.out.println("The average of of arrays are: " +(sumofmyArrays/count));

    }

}
