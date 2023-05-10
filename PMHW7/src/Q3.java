/*Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class Q3
{
    public static void main(String[] args)
    {
        multidimarrays();
    }

    public static void multidimarrays()
    {
        String countries[]= {"India", "America","Canada", "Australia","Newzealand"};// 5 countries
        String capitals[]= {"Delhi","Washington DC","Ottawa", "Canberra","Wellington"};// 5 capitals
        int i =0;
        for(i=0; i<5; i++){

            System.out.println(countries[i]+" = "+ capitals[i]);
        }



    }

}
