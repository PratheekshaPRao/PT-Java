
package mod2;


public class p1 {
    //data mem
    int age=10;
    String name="abc";
    //mem func
    void read()
    {
        System.out.println("reading");
    }
    public static void main(String[] args){
        System.out.println("prog start");
        p1 p=new p1();
      System.out.println("my age is"+" "+p.age);
        System.out.println("my name is"+" "+p.name);
        p.read();
        System.out.println("prog ends");
    }
}
