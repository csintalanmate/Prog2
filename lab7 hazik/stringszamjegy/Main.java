public class Main
{
    public static void main(String[] args)
    {
        String s = "90146852";
        int result = osszeg(s);
        System.out.println("A stringben levo szamok osszege: " + result);
    }
    static int osszeg(String s)
    {
        char[] szamok = s.toCharArray();
        int result = 0;
        for (char c : szamok)
        {
            result += (c-'0');
        }
        return result;
    }
}