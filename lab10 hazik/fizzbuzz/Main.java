class FizzBuzz
{
    private static int lim;

    public FizzBuzz(int lim)
    {
        this.lim = lim;
    }

    public static void start()
    {
        for (int i = 1; i <= lim; i++)
        {
            String out = "";
            if (i % 3 == 0) out += "Fizz";
            if (i % 5 == 0) out += "Buzz";
            System.out.println(out.isEmpty() ? i : out);
        }
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        FizzBuzz fb = new FizzBuzz(100);
        fb.start();
    }
}