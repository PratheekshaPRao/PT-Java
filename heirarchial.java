/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
class person{
    void human(){
        System.out.println("he is a human...");
    }
}
class walk extends person{
    void disp(){
        System.out.println("executing walk class...");
    }
}
class run extends person{
    void show(){
        System.out.println("executing run class...");
    }
}
public class heirarchial {
    public static void main(String[] args){
        walk w=new walk();
        w.human();
        w.disp();
        run r=new run();
        r.human();
        r.show();
    }
    
}
