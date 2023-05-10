//Write a java program to print the numbers between 1 to 100 which can be divided by 3and
//5 separately.
public class Q14 {
    public static void main(String[] args)
    {
        division();
    } // main method

    public static void division() { // static method
        System.out.println("The numbers are divisible by 3: ");
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i+ " ");
            } i++;
        }
        System.out.println("The number is divisible by 5 : ");
        int a = 1;
        while(a<=100)
        {
            if(a % 5 ==0){
                System.out.println(a+" ");
            }a++;
        }
        System.out.println();
    }
}
