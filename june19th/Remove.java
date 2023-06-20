package june19th;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("sai");
        arr1.add("hari");
        arr1.add("vijay");
        arr1.add("nithin");
        arr1.add("shashu");
        arr1.remove(arr1.size()-1);
        arr1.stream().forEach(System.out::println);
    }
}
