public class june5thInterface implements A,B{
    @Override
    public int add(int a,int b) {
        return a+b;
    }

    @Override
    public int sub(int a,int b) {
        return a-b;
    }
    public static void main( String args[]){
        june5thInterface obj = new june5thInterface();
        int x= obj.add(5,4);
        int y=obj.sub(8,4);
        System.out.println("added value is "+x);
        System.out.println("subtracted value is "+y);

    }
}
interface A{
    public int add(int a,int b);
}
interface B{
    public int sub(int a,int b);
}
