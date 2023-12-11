import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Delete
{
    // kiszuri majd visszaadja egy listaban a ".html" kiterjesztesu fileokat
    public static List<String> filterHtmlFiles(String kepPath)
    {
        List<String> htmls = new ArrayList<>();

        File f = new File(kepPath);
        File[] pathNevek = f.listFiles();

        assert pathNevek != null;

        for (File pathname : pathNevek)
        {
            String aktualis = pathname.toString();
            if (pathname.isFile() && (aktualis.endsWith(".html")))
            {
                String[] st = (pathname.toString()).split(File.separator + File.separator);
                htmls.add(st[st.length - 1]);
            }
        }

        Collections.sort(htmls);
        return htmls;
    }

    // egy listaba megkapja a ".html" kiterjesztesu fileokat es kitorli oket
    public static void deleteHtmlFiles(List<String> mappak)
    {
        List<String> htmls = new ArrayList<>();

        for (int i = 0; i < mappak.size(); i++)
        {
            List<String> aktualis = filterHtmlFiles(mappak.get(i));

            for (int j = 0; j < aktualis.size(); j++)
            {
                htmls.add(mappak.get(i) + aktualis.get(j));
            }
        }

        for(int j = 0; j < htmls.size(); j++)
        {
            File file = new File(htmls.get(j));
            file.delete();
        }

        System.out.println("INFO\t" + "html files deleted.");
    }
}