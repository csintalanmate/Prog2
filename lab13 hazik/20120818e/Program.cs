using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    {
        var result = PyUtils.Range(0, 1000).Where(n => (n % 3 == 0) || (n % 5 == 0)).Sum();
        WriteLine(result);
    }
}