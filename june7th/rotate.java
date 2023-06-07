package june7th;

import java.util.Arrays;
public class rotate {
    public static void main(String args[]){
        int[] c={1, 2, 3, 4, 5, 6, 7};
        int x=2;
        for (int i=0;i<2;i++) {
                int t=c[0];
                for(int j=0;j<c.length-1;j++) {

                    c[j]=c[j+1];
                }
                c[c.length-1]=t;
            }
        System.out.print(Arrays.toString(c));
        }

    }
