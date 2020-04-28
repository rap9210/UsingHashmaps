import java.util.HashMap;
import java.util.Scanner;

public class UsingHashmaps {
    public static void main(String[] args) {
        /*
        Initiate new Hashmap. Set key and value data types.
        Initiate while loop for entering keys and attaining values.
        Option to add new keys and values.
        Print out hashmap at the end of every iteration.
         */
        HashMap<Integer, String> my_first_hashmap = new HashMap<Integer, String>();
        my_first_hashmap.put(1, "one");
        my_first_hashmap.put(2, "two");
        my_first_hashmap.put(3, "three");

        Scanner scn = new Scanner(System.in);
        String initiate = "y";
        while(initiate.equalsIgnoreCase("y")) {
            System.out.println("Enter a number key to view its value: ");
            int user_input = scn.nextInt();
            scn.nextLine();
            if (my_first_hashmap.containsKey(user_input)) {
                System.out.println(user_input+" "+my_first_hashmap.get(user_input));
            } else {
                System.out.println("That does not exist, create new key? y/n ");
                String add_new_key = scn.nextLine();
                if (add_new_key.equalsIgnoreCase("y")) {
                    System.out.println("Enter new value for key #" + user_input);
                    add_new_key = scn.nextLine();
                    my_first_hashmap.put(user_input, add_new_key);
                }
                for (int i: my_first_hashmap.keySet()){
                    System.out.println(i+" "+my_first_hashmap.get(i));
                }
            }
            System.out.println("Re-initiate? y/n");
            initiate = scn.nextLine();
        }
    }
}
