using System.Collections.Immutable;
using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    {
        string s = "42";
        int i = s.ToInt();
        WriteLine(i);
    }
}