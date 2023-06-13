package june13th;
public class custom_exception {


        public static void test(int a,int b) {
            try {
                if(b==0) {
                    throw new custonExceptionr("Cannot Divide By zero");
                }
                else {
                    System.out.println(a/b);
                }
            }
            catch(custonExceptionr r) {

                System.out.println(r);

            }

        }
        public static void main(String [] args) {

            test(5,0);
        }
}


 class custonExceptionr extends RuntimeException {

    public custonExceptionr(String s) {
        super(s);
    }

}
