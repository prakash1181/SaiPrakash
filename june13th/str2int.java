package june13th;

public class str2int {
    public static int string2int(String str) throws Exception{

        return Integer.parseInt(str);
    }
    public  static void main(String args[]){
        String[] str1={"abd","23","45.67","123f"};
        for(int i=0;i<str1.length;i++){
        try{
        System.out.println(string2int(str1[i]));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }
}
