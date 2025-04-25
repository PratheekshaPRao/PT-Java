/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
import java.util.Scanner;
public class perfectno {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num+"is a perfect num");
        }else{
            System.out.println(num+"is not a perfect num");
        }
}
}

