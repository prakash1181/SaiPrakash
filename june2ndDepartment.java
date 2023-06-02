public class june2ndDepartment {
    public static void main(String []args){
    ChildDepartment dep=new ChildDepartment();
    dep.getDepartmentSize();

}}
abstract class Department{
    abstract int getDepartmentSize();
}
class ChildDepartment extends Department{
    int getDepartmentSize(){
      return 10;
    }
}