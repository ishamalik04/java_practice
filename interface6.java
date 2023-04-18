// default method in interface
// Since Java 8, we can have method body in interface. But we need to make it default method.
interface drawable
{
    void print();
    default void msg()
    {
        System.out.println("this is default method in interface");
    }
}
class Rectangle implements drawable
{
    public void print()
    {
        System.out.println("drawing rectangle");
    }
}
class Main
{
    public static void main(String args[])
    {
        drawable d=new Rectangle();
        d.print();
        d.msg();
    }
}
