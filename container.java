/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;

/**
 *
 * @author SMV
 */
public class container {
    int capacity;
    container(int a)
    {
        capacity =a;
    }
    public static void main(String[] args){
        container c=new container(500);
        System.out.println(c.capacity);
        container c1=new container(1500);
        System.out.println(c1.capacity);
        container c2=new container(2000);
        System.out.println(c2.capacity);
    }
}
