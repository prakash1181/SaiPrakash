package june20th;

import java.util.HashMap;

public class Target_sum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Integer[] arr={10,20,30,40,50,60};
        int target=100;
        for(int i=0;i< arr.length;i++){
            hm.put(arr[i],i);
        }
        for (int i=0;i< arr.length;i++){
          if(hm.containsKey(target-arr[i])){
              System.out.println(i+","+hm.get(target-arr[i]));
          }
        }
    }
}
