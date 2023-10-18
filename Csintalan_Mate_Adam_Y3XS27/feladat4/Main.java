import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String fname = "games.csv";
        List<String> sorok = FileUtils.readLines(fname);
        String[] konzol = new String[1000000];
        int index = 0;
        for(String sor : sorok)
        {
            String[] jatek = sor.split(",");
            konzol[index] = jatek[0];
            index++;
        }
        System.out.println("Elérhető konzolok: " + konzol.toString());
    }
}