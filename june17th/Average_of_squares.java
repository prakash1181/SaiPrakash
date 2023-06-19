package june17th;

import java.util.Arrays;

public class Average_of_squares {
    public static void main(String args[]){
        int[] a={3,9,29,38,24,48,94};
        System.out.println(Arrays.stream(a).filter(x->x%2!=0).map(x->x*x).average().toString());
    }
}
