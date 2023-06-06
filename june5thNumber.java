public class june5thNumber {
   static int  x=123456;
    public static void main(String args[]){
        int y=0;
        while(x/10>0){
            y=(y*10)+x%10;
            x=x/10;
        }
        y=(y*10)+x%10;
        System.out.println(y);
    }
}
