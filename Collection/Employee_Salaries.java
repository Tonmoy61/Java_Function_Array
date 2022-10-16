/* Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary */

package Function_And_Array;

public class Employee_Salaries {
    public static void main(String[] args) {
        int First_Highest = 0;
        int Second_Highest = 0;
        int Third_Highest = 0;

        int[] employSalary = {35000, 25000, 28000, 32500, 44000, 32800};

        for (int j : employSalary) {
            if (j > First_Highest) {
                Third_Highest = Second_Highest;
                Second_Highest = First_Highest;
                First_Highest = j;
            } else if (j > Second_Highest) {
                Third_Highest = Second_Highest;
                Second_Highest = j;
            } else if (j > Third_Highest) {
                Third_Highest = j;
            }
        }
        System.out.println("Third highest salary is: " + Third_Highest);
    }
}
