interface printable
{
    void print();
}
class Main implements printable
{
    public void print()
    {
        System.out.println("hello everyone");
    }
    public static void main(String args[])
    {
        Main obj=new Main();
        obj.print();
    }
}
