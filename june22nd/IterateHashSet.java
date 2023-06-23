package june22nd;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet{
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Classical");
        hs.add("Flamenco");
        hs.add("Acoustic");
        hs.add("Acoustic");
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        hs.forEach(System.out::println);
        hs.stream().forEach(System.out::println);
    }
}
