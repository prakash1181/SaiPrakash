package june22nd;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        String str="Debussy wrote these two short dances to a commission from the instrument-making firm";
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<str.length();i++){
            hs.add(str.substring(i,i+1).toLowerCase());
        }
        hs.forEach(System.out::println);

    }
}
