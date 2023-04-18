abstract class bike
{
    bike()
    {
        System.out.println("bike started");
    }
    abstract void run();
    void changegear()
    {
        System.out.println("gear changed");
    }
}
class honda extends bike
{
    void run()
    {
        System.out.println("bike is running");
    }
}
class Main
{
    public static void main(String args[])
    {
        bike obj=new honda();
        obj.run();
        obj.changegear();
    }
}
