
package mod2;

import java.util.Scanner;
public class StrongNo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=s.nextInt();
        int originalnum=num;
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
            
        }
        if(sum== originalnum){
            System.out.println(originalnum+"is a strong num:");
        }else{
            System.out.println(originalnum+"is not strong num:");
        }
}
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
        }
}
