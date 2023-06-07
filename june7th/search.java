package june7th;

public class search {
    public static void  main(String args[]){
        int a[]={3,92,29,84,44,9,15};
        int x=a[0];
        int y=a[0];
        for(int i=1;i<a.length;i++){
            x=x<a[i]?a[i]:x;
            y=y>a[i]?a[i]:y;
        }
        System.out.println(x+" "+y);
    }
}
