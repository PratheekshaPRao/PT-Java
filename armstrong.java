package mod2;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=s.nextInt();
        int originalnum=num;
        int sum=0;
        int digits=countdigits(num);  
        while(num>0){
            int digit=num%10;
            sum+=power(digit,digits);
            num/=10;
        }
        if(sum==originalnum){
            System.out.println(originalnum+"is a armstrong num:");
        }else{
            System.out.println(originalnum+"is not armstrong num:");
        }
    }
    public static int countdigits(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count++;
    }
    public static int power(int base,int exp){
    int result=1;
    for(int i=1;i<=exp;i++){
        result*=base;
    }
    return result;
    }
}
