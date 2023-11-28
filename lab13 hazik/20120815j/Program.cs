using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    {
        int pelda1 = 1977;
        int pelda2 = 12568;

        int rev1 = Reverse(pelda1);
        int rev2 = Reverse(pelda2);
        
        WriteLine("Eredeti: " + pelda1 + "\nUj: " + rev1);
        WriteLine("Eredeti: " + pelda2 + "\nUj: " + rev2);
    }
    
    private static int Reverse(int n)
    {
        string s = "";
        foreach (var c in n.ToString().ToCharArray().Reverse())
        {
            s += c;
        }
        return int.Parse(s);
    }
}