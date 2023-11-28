using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    {
        List<string> sorok = FileUtils.ReadLines("in.txt");
        List<int> szamok = FileUtils.ReadLinesAsInts("in.txt");
        
        WriteLine(string.Join(", ", sorok));
        WriteLine(string.Join(", ", szamok));
    }
}