import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory
{
    private static String[] formatumok = {".png", ".jpg", ".jpeg", ".gif"};

    // visszaadja a mappakat listakent
    public static List<String> listDirectories(String aktualisDir)
    {
        List<String> mappak = new ArrayList<>();

        File file = new File(aktualisDir);
        File[] pathNevek = file.listFiles();

        assert pathNevek != null;

        for (File pathname : pathNevek)
        {
            if (pathname.isDirectory())
            {
                String[] st = (pathname.toString()).split(File.separator + File.separator);
                mappak.add(st[st.length-1]);
            }
        }

        Collections.sort(mappak);
        return mappak;
    }

    // visszaadja a html-eket listakent
    public static List<String> listHtml(String aktualisDir)
    {
        List<String> html = new ArrayList<>();

        File file = new File(aktualisDir);
        String[] pathNevek;
        pathNevek = file.list();

        assert pathNevek != null;

        for (String pathname : pathNevek)
        {
            if (pathname.endsWith(".html"))
            {
                html.add(pathname);
            }
        }

        Collections.sort(html);
        return html;
    }

    // visszaadja a kepeket listakent
    public static List<String> getPhotos(String aktualisDir)
    {
        List<String> kepek = new ArrayList<>();

        File file = new File(aktualisDir);
        File[] pathNevek = file.listFiles();

        assert pathNevek != null;

        for (File pathname : pathNevek)
        {
            String aktualis = pathname.toString().toLowerCase();

            if (pathname.isFile())
            {
                for (String form : formatumok)
                {
                    if (aktualis.endsWith(form))
                    {
                        String[] pathReszek = pathname.toString().split(File.separator + File.separator);
                        kepek.add(pathReszek[pathReszek.length-1]);
                    }
                }
            }
            
        }

        Collections.sort(kepek);
        return kepek;
    }

    // rekurziv listava alakit
    public static List<String> recursiveList(File konyvtar, List<String> mappak)
    {
        File[] files = konyvtar.listFiles();

        assert files != null;

        for (File file : files)
        {
            if (file.isDirectory())
            {
                mappak.add(file.toString() + "\\");
                recursiveList(file, mappak);
            }
        }
        return mappak;
    }
    
}