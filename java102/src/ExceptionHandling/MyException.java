package ExceptionHandling;

class Myexception extends Exception
{
    int detail;
    Myexception(int a)
    {
        detail = a;
    }
    public String toString()
    {
        return "detail";
    }
}
class Output
{
    static void compute (int a) throws Myexception
    {
        throw new Myexception(a);
    }
    public static void main(String args[])
    {
        try
        {
            compute(3);
        }
        catch(Myexception e)
        {
            System.out.print("Exception");
        }
    }
}
