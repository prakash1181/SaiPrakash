public class june6thFibonacci {
    public static void main(String []args){
        int i=10;
        int x=0;
        int y=1;
        System.out.print(x+","+y);
        for(int j=0;j<i-2;j++){
           y=x+y;
           System.out.print(","+y);
           x=y-x;
        }

    }
}
