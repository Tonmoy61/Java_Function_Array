/* Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item
from your HashMap and return the price. If found no item, then print message as "No item found"
and another function named totalSum() which will return total price of items.*/

package Function_And_Array;
import java.util.HashMap;
import java.util.Scanner;

public class Bazaar_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your products name: ");

        String itemsName = input.nextLine();

        searchItem(itemsName);
        input.close();
    }

    public static void searchItem(String itemsName) {
        HashMap<String, Integer> itemsList = new HashMap<>();

        itemsList.put("coke", 65);
        itemsList.put("juice", 100);
        itemsList.put("chips", 20);
        itemsList.put("chocolate", 10);

        int result;

        if (itemsList.containsKey(itemsName))
        {
            result = itemsList.get(itemsName);
            System.out.println("Items price: " + result);
        }
        else
        {
            System.out.println("No items found");
        }
    }
}
