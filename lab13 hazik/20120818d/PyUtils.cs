namespace Example;

public static class PyUtils
{
    public static List<int> Range(int also, int felso, int lepes)
    {
        var list = new List<int>();
        for (int i = also; i < felso; i+= lepes)
        {
            list.Add(i);
        }

        return list;
    }

    public static List<int> Range(int also, int felso)
    {
        return Range(also, felso, 1);
    }

    public static List<int> Range(int felso)
    {
        return Range(0, felso, 1);
    }

    public static string Capitalize(string s)
    {
        s = s.ToLower();
        return char.ToUpper(s[0]) + s[1..];
    }
}