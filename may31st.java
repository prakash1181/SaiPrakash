public class may31st {
  public static void main(String []args){
  student std= new student();
  System.out.println(std.getName());
  std.setName("prakash");
  System.out.println(std.getName());
}
}
class student{
    String name="sai prakash";
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}