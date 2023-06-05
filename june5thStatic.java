
class Static1{
    static int x;
    static void data(int b){
        x=b;
    }
    static{
        data(5);
        System.out.println("static block ");
    }
}
public class june5thStatic {
   public static void main(String args[]){
       System.out.println(Static1.x);
   }
}

