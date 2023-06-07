package june7th;

public class reverse {
    public static void main( String args[]){
        int b[]={3,92,29,84,44,9,15};
        int j=b.length - 1;
        int k=0;
        for(int i=0;i<b.length/2;i++){
            k=b[i];
            b[i]=b[j];
            b[j]=k;
            j--;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
