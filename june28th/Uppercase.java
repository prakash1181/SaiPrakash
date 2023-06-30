package june28th;

import java.util.Locale;
import java.util.Optional;

public class Uppercase {

    public static void main(String[] args) {
        String str="dhdohdeg";
       to_upper(Optional.ofNullable(str));
    }

    private static void to_upper(Optional<String> str) {
        if(str.isPresent()){
            System.out.println(str.get().toUpperCase());
        }
        else {
            System.out.println(Optional.empty());
        }
    }
}
