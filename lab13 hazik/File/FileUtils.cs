namespace Example;
using System.IO;
public static class FileUtils
{
    public static List<string> ReadLines(string fname)
    {
        List<string> sorok = new List<string>();
        var f = new StreamReader(fname);
        string line;
        while ((line = f.ReadLine()) != null)
        {
            sorok.Add(line);
        }
        f.Close();
        return sorok;
    }

    public static List<int> ReadLinesAsInts(string fname)
    {
        List<string> sorok = ReadLines(fname);
        return sorok.Select(n => int.Parse(n)).ToList();
    }
}