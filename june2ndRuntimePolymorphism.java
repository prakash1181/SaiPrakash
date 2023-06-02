public class june2ndRuntimePolymorphism {
    public static void main(String args[]){
    parent obj=new child();
     int x=obj.fun1();
     System.out.println(x);
}}
class parent{
   int fun1(){
       return 10;
   }
}
class child extends parent{
    int fun1(){
        return 15;
    }
}