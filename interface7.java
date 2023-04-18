//static method in interface
//Since Java 8, we can have static method in interface
interface printable
{
    void print();
    static int cube(int x)
    {
        return x*x*x;
    }
}
class Rectangle implements printable
{
    public void print()
    {
        System.out.println("helwww guyzz");
    }
}
class Main
{
    public static void main(String args[])
    {
        printable p=new Rectangle();
        p.print();
        System.out.println(printable.cube(3));
    }
}
