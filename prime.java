
package mod2;

import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=s.nextInt();
        if(num<=1){
            System.out.println(num+"is not prime num:");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+"is prime num:");
            }else{
                System.out.println(num+"is not prime num:");
            }
        }
        
        }

}
