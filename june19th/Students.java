package june19th;

import java.util.ArrayList;

class Student{
    String firstName;
    String LastName;
    Double GPA;
    Student(String firstName,String lastName,Double GPA ){
        this.firstName=firstName;
        this.LastName=lastName;
        this.GPA=GPA;
    }
}
public class Students {
    public static void main(String[] args) {
        ArrayList<Student> arr1 = new ArrayList<>();
        arr1.add(new Student("sai", "andem", 3.3));
        arr1.add(new Student("nithin", "ba", 3.5));
        arr1.add(new Student("shashu", "challa", 3.8));
        Double count = 0.0;
        for (Student std : arr1) {
            count = count + std.GPA;
        }
        for (Student std:arr1){
            if(count<=(std.GPA* arr1.size())){
                System.out.println(std.firstName);
            }
        }

    }
}
