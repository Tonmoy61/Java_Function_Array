/* Take 5 numbers from users in an array. Then find out the average number,
how many even and how many odd numbers using these functions: average(), countEvenNumbers(),
countOddNumbers()*/

package Function_And_Array;
import java.util.Scanner;
public class Find_Average_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array:");

        int number = input.nextInt();

        double total = 0;
        double[] array = new double[number];

        System.out.println("Enter the elements one by one:");

        average(input, number, total, array);
        countEvenNumbers( array);
        countOddNumbers( array);

    }

    public static void average(Scanner input, int number, double total, double [] array) {

        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextDouble();
        }

        for (double v : array) {
            total += v;
        }

        double average = total / number;

        System.out.println("The average value is: " + average);

        input.close();

    }


    public static void countEvenNumbers(double [] array) {

        int evenCount = 0;

        for (double v : array) {
            if (v % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("even number " + evenCount);

    }

    public static void countOddNumbers(double [] array) {
        int oddCount = 0;

        for (double v : array) {
            if (v % 2 != 0)
                oddCount++;
        }
        System.out.println("odd number " + oddCount);

    }
}
