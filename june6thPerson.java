public class june6thPerson {
    int age;
     june6thPerson(int x){
        this.age=x;
    }
    String personType(int age ) {
        if (age < 13) {
            return "kid";
        }
        else if (age <19) {
           return "teen";
        }
        else{
            return "adult";
        }
    }
    public static void main(String args[]){
        june6thPerson obj=new june6thPerson(15);
        System.out.println(obj.personType(obj.age));
    }
}
