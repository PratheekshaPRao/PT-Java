
public class num5 {
    public static void main(String[] args){
        
        int rem=0;
        int n=1010;
        int base=2;
        int i=0;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum=(int) (sum+rem*Math.pow(base,i));
            i++;
            n=n/10;
        }
        System.out.println(sum);
    }
}
