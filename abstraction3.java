abstract class bank
{
    abstract int getroi();
}
class sbi extends bank
{
    int getroi()
    {
        return 10;
    }
}
class pnb extends bank
{
    int getroi()
    {
        return 9;
    }
}
class icici extends bank
{
    int getroi()
    {
        return 8;
    }
}
class Main
{
    public static void main(String args[])
    {
        bank b;
        b=new sbi();
        System.out.println("Rate of Interest of sbi is: "+b.getroi()+" %");
        b=new pnb();
        System.out.println("Rate of Interest of pnb  is: "+b.getroi()+" %");
        b=new icici();
        System.out.println("Rate of Interest is: "+b.getroi()+" %");
    }
}
