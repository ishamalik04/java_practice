// abstract class
abstract class Car
{
    abstract void name();
}
class Main extends Car
{
    void name()
    {
        System.out.println("car name is rangerover");
    }
    public static void main(String args[])
    {
        Car obj=new Main();
        obj.name();
    }
}
