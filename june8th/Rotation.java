package june8th;

public class Rotation {
    boolean flag=true;
    public void test(String s,String ss) {
        for (int i = 0; i <= s.length(); i++) {
            if (s.equals(ss)) {
                flag = true;
                break;
            } else {
                char c = s.charAt(0);
                s = s.substring(1);
                if ((s + c).equals(ss)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }



        }
        System.out.println(flag);
    }
    public static void main(String[] args){
        Rotation m=new Rotation();
        m.test("arya","arya");

    }}
