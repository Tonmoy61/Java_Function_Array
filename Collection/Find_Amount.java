/*  Input an amount from the user and find out the number of notes from input
amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3 */

package Function_And_Array;
import java.util.Scanner;
public class Find_Amount {
    public static void main(String[] args) {

        int [] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int totalAmount;

        Scanner inputAmount = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        totalAmount = inputAmount.nextInt();

        NumberOfNotes(notes, totalAmount);

        inputAmount.close();

    }

    public static void NumberOfNotes(int [] notes, int totalAmount) {
        int temp = totalAmount;

        for (int note : notes) {

            System.out.println("Number of " + note + " notes = " + temp / note);
            temp = temp % note;
        }
    }
}
