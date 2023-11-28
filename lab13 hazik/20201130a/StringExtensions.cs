using System.Reflection.Metadata;

namespace Example;

public static class StringExtensions
{
    public static int ToInt(this string str)
    {
        return int.Parse(str);
    }
}