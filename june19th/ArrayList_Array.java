package june19th;

import java.util.ArrayList;

public class ArrayList_Array {
    public static void main(String[] args)
    {

        ArrayList<String> arr1 = new ArrayList<String>();

        // Populating the ArrayList by custom elements
        arr1.add("sai");
        arr1.add("shashu");
        arr1.add("thin");
        arr1.add("vijay");

        String[] str1 = new String[arr1.size()];

        for (int i = 0; i < arr1.size(); i++) {
            str1[i] = arr1.get(i);
        }
        for (String k : str1) {
            System.out.println(k);
        }
    }
}
