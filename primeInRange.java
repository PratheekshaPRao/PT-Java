
package mod2;
public class primeInRange {
    public static void main(String[] args){
        for(int num=1;num<=50;num++){
            boolean isprime =true;
            if(num<=1){
                continue;
            }
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(num+" is a prime num.");
            }
        }
    }
}
