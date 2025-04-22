
package mod2;
class beta
{
    void print()
    {
        System.out.println("executing print...");
    }
}
class gama extends beta
{
    
}
public class singleLevel {
    public static void main(String[] args){
        gama g=new gama();
        g.print();
        
    }
}
