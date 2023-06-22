package june20th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Students{
    String firstName;
    String LastName;
    Double GPA;
    Students(String firstName,String lastName,Double GPA ){
        this.firstName=firstName;
        this.LastName=lastName;
        this.GPA=GPA;
    }
    public String toString() {
        return  "firstName: "+this.firstName+", lastName: "+this.LastName+", GPA:"+this.GPA;
    }
}
public class Student {

    public static void main(String args[]) {

        Map<String, Students> std = new HashMap<String, Students>();
        std.put("sai",new Students("sai", "andem", 3.3));
        std.put("shashu",new Students("shashu", "challa", 3.8));
        std.put("nithin",new Students("nithin", "ba", 3.5));
        for (Map.Entry<String, Students> entry : std.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        std.forEach((k,v)->System.out.println(k+" "+v));
        Iterator it = std.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}