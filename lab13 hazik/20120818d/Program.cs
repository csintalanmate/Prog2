using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    { 
        F1(); F2(); F3(); F4(); F5(); F6(); F7();
        F8(); F9(); F10(); F11(); F12(); F13(); F14(); F15();
    }

    private static void F1()
    {
        WriteLine("1.feladat");
        List<string> lista = new List<string>() { "auto", "villamos", "metro" };
        var result = lista.Select(n => n.ToUpper() + "!").ToList();
        WriteLine(string.Join(", ", result));
    }

    private static void F2()
    {
        WriteLine("2.feladat");
        List<string> nevek = new List<string>() { "aladar", "bela", "cecil" };
        var result = nevek.Select(s => PyUtils.Capitalize(s)).ToList();
        WriteLine(string.Join(", ", result));
    }

    private static void F3()
    {
        WriteLine("3.feladat");
        var lista = PyUtils.Range(0, 10).Select(n => 0).ToList();
        WriteLine(string.Join(", ",lista));
    }

    private static void F4()
    {
        WriteLine("4.feladat");
        var lista = PyUtils.Range(1, 10 + 1).Select(n => 2 * n).ToList();
        WriteLine(string.Join(", ", lista));
    }

    private static void F5()
    {
        WriteLine("5.feladat");
        var lista = new List<string>() { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        var result = lista.Select(n => int.Parse(n)).ToList();
        WriteLine(string.Join(", ", result));
    }

    private static void F6()
    {
        WriteLine("6.feladat");
        string s = "1234567";
        var list = s.Select(n => n - '0').ToList();
        WriteLine(string.Join(", ", list));
    }

    private static void F7()
    {
        WriteLine("7.feladat");
        string s = "The quick brown fox jumps over the lazy dog";
        var lista = s.Split().Where(n => n.Length != 0).Select(n => n.Length).ToList();
        WriteLine(string.Join(", ", lista));
    }

    private static void F8()
    {
        WriteLine("8.feladat");
        string s = "python is an awesome language";
        var lista = s.Split().Where(n => n.Length != 0).Select(n => n[0]).ToList();
        WriteLine(string.Join(", ", lista));
    }

    private static void F9()
    {
        WriteLine("9.feladat");
        string s = "The quick brown fox jumps over the lazy dog";
        var list = s.Split().Where(n => n.Length != 0).Select(n => new Tupple(n)).ToList();
        WriteLine(string.Join(",", list));
    }

    private static void F10()
    {
        WriteLine("10.feladat");
        var list = PyUtils.Range(0, 10).Where(n => n % 2 == 0).ToList();
        WriteLine(string.Join(", ", list));
    }

    private static void F11()
    {
        WriteLine("11.feladat");
        var list = PyUtils.Range(0, 20).Select(n => n * n).Where(n => n % 2 == 0).ToList();
        WriteLine(string.Join(", ", list));
    }

    private static void F12()
    {
        WriteLine("12.feladat");
        var list = PyUtils.Range(0, 20).Select(n => n * n).Where(n => n.ToString().EndsWith('4')).ToList();
        WriteLine(string.Join(", ", list));
    }

    private static void F13()
    {
        WriteLine("13.feladat");
        int A = Convert.ToInt32('A');
        int Z = Convert.ToInt32('Z');
        var list = PyUtils.Range(A, Z + 1).Select(n => (char) n).ToList();
        var s = "";
        foreach (var c in list)
        {
            s += c;
        }
        WriteLine(s);
        
    }

    private static void F14()
    {
        WriteLine("14.feladat");
        var list = new List<string>() { " apple ", " banana ", " kiwi" };
        var result = list.Select(n => n.Trim()).ToList();
        WriteLine(string.Join(", ", result));
    }

    private static void F15()
    {
        WriteLine("15.feladat");
        var lista = new List<int>() { 1, 0, 1, 1, 0, 1, 0, 0 };
        var list = lista.Select(n => n.ToString()).ToList();
        var s = "";
        foreach (var c in list)
        {
            s += c;
        }
        WriteLine(s);
    }
}

public class Tupple
{
    private string s;

    public Tupple(string s)
    {
        this.s = s;
    }

    public override string ToString()
    {
        return string.Format($"('{s}', {s.Length})");
    }
}