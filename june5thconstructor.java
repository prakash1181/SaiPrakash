public class june5thconstructor {
    public static void main(String args[]){
        child2 obj =new child2(5);
        child2 obj2 =new child2(3,4);
        int a=obj.x;
        int b=obj.y;
        int c=obj2.x;
        int d=obj2.y;
        System.out.println(a+" "+b+" "+c+" "+d);

    }
}
class parent1{
    int x;
}
class child2 extends parent1{
    int y;
    child2(int x, int y){
        this.x=x;
        this.y=y;
    }
    child2(int y){
        this.y=y;
    }
}