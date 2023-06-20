package june19th;

import java.util.ArrayList;
import java.util.Iterator;

public class Traverse {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
       arr1.add("sai");
       arr1.add("hari");
       arr1.add("vijay");
       arr1.add("nithin");
       arr1.add("shashu");

       for(int i=0;i< arr1.size();i++){
           System.out.println(arr1.get(i));
       }
       for(String str : arr1){
           System.out.println(str);
       }
       arr1.forEach(x->System.out.println(x));
        Iterator it = arr1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        arr1.stream().forEach(System.out::println);
    }
}
