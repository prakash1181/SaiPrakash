package june17th;

import java.util.Arrays;

public class Sort{
    public static void main(String args[]){
        String[] str1={"sai","hari","shashu","nithin","vijay"};
        Arrays.stream(str1)
                .sorted((a,b)->Character.compare(a.charAt(a.length()-1),b.charAt(b.length()-1)))
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .forEach(System.out::println);
    }

}
