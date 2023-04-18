// Inheritance of interface
interface printable
{
    void print();
}
interface showable extends printable
{
    void show();
}
class Main implements showable
{
    public void print()
    {
        System.out.println("YOOOOOO");
    }
    public void show()
    {
        System.out.println("Thereee");
    }
    public static void main(String args[])
    {
    Main obj=new Main();
    obj.print();
    obj.show();
    }
}
