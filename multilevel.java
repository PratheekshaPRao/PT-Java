/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
class whatsapp1
{
    void chat()
    {
        System.out.println("texting...");
    }
}
class whatsapp2 extends whatsapp1
{
    void call()
    {
    
    System.out.println("voice/video call...");
}
}
class whatsapp3 extends whatsapp2
{
    void status()
    {
     System.out.println("status....");
    }
}
public class multilevel {
    public static void main(String[] args){
    whatsapp3 w=new whatsapp3();
    w.chat();
    w.call();
    w.status();
}
}




