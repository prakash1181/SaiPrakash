package june17th;

import java.util.Arrays;

public class Vowels {
    public static void main(String args[]){
        String[] str1={"sai","hari","shashu","nithin","vijay","pw"};
        Arrays.stream(str1).filter(x->containsVowels(x.toLowerCase())).forEach(x->System.out.println(x+" "+vowelCount(x)));
    }
    public static boolean containsVowels(String s) {
        if(s.contains("a")||s.contains("o")||s.contains("e")||s.contains("i")||s.contains("u")){
            return true;
        }
        return false;
    }
    public static int vowelCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               count++;
            }
        }
        return count;
    }
}
