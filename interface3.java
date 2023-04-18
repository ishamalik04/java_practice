interface bank
{
    float roi();
}
class SBI implements bank
{
    public float roi()
    {
       return 9.15f;
    }
}
class PNB implements bank
{
    public float roi()
    {
        return 9.7f;
    }
}
class Main
{
    public static void main(String args[])
    {
        bank b=new SBI();
        System.out.println("ROI of SBI : "+b.roi());
        bank b1=new PNB();
        System.out.println("ROI of PNB : "+b1.roi());
    }
}
