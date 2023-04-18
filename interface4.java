// Multiple inheritance in java
interface printable
{
    void print();
}
interface showable
{
    void show();
}
class Main implements printable,showable
{
    public void print()
    {
        System.out.println("helwwwwwwww");
    }
    public void show()
    {
        System.out.println("guyzzzzzzz");
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        obj.print();
        obj.show();
    }
}
