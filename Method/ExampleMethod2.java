package Method;

public class ExampleMethod2 
{
    public int max(int x, int y)//x & y are formal parameter
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String[] args) 
    {
        ExampleMethod2 meth = new ExampleMethod2();
        int a=100;
        int b=109;
        int c;
        c=meth.max(a,b);//a & b are actual parameter
        System.out.println(c);
    }
}
