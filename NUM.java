
public class NUM {
    public static void main(String[] args){
        int n=1234;
        int count=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println("the count is"+count);
    }
}
