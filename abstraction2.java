abstract class shape
{
    abstract void draw();
}
class Rectangle extends shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle extends shape
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}
class Main
{
    public static void main(String args[])
    {
        shape s=new Circle();
        s.draw();
        shape s1=new Rectangle();
        s1.draw();
    }
}
