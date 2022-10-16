/* Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element*/
package Function_And_Array;
import java.util.Scanner;

public class Check_Number {
    public static void main(String[] args) {
        try {
            int[] number = {1, 3, 5, 7, 2, 4, 6, 8};
            int num, flag = 0, index = 0;

            System.out.println("Enter your number: ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            for (int i = 0; i < number.length; i++) {

                if (num == number[i]) {
                    flag = 1;
                    index = i;
                }
            }
            if (flag == 1) {
                System.out.println("Found in the position: " + index);
            } else {
                System.out.println("Found no element");
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Enter valid number ");
        }

    }
}
