package june8th;

public class Reverse {
    public static boolean equal(String str1,String str2) {
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        if(arr1.length!= arr2.length) return false;
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]!=arr2[arr2.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str1="Java J2EE Reverse Me";
        String str2="avaJ EE2J esreveR eM";
        String strArray1[] = str1.split(" ");
        String strArray2[] = str2.split(" ");
        for(int i=0;i< strArray1.length;i++){
           if(!equal(strArray1[i],strArray2[i])){
              System.out.println("false");
              break;
           } else if (i== strArray1.length-1) {
               System.out.println("true");
           }
        }

}
}
