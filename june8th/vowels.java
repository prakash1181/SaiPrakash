package june8th;

public class vowels {
    public static void main(String args[]){
        String a ="write a program to find number of vowels in that string";
        int count =0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
               count++;
            }
        }
      System.out.println(count);
    }
}
