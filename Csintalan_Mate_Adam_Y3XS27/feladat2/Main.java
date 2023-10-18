import java.util.Scanner;

public class Main
{
    private final static String melyMghk = "aáoóuúAÁOÓUÚ";
    private final static String magasMghk = "eéiíöőüűEÉIÍÖŐÜŰ";


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Szoveg: ");
            String text = sc.nextLine();
            if (text.equals("*"))
            {
                break;
            }
            //else
            String result = modosit(text);
            System.out.println("Eredmeny: " + "'" + result + "'");
            System.out.println();
        }
    }
    private static String modosit(String text)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray())
        {
            if (magasMghk.contains("" + c))
            {
                continue;
            }
            sb.append(c);
            if (melyMghk.contains("" + c))
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}