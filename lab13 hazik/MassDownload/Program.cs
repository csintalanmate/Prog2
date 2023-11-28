using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    {
        var template = "http://example.com/galleryFX/{0}.jpg";

        for (int i = 1; i < 16; i++)
        {
            WriteLine(template, i);
        }
    }
}