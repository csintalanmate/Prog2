import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        String konyvtarPath;
        String strKonyvtarPath;

        if (args.length == 1) // ha csak az eleresi utat adom meg:
        {
            konyvtarPath = args[0]; // gyokerkonyvtar nevenek a tarolasa
            File file = new File(konyvtarPath); // absztrakt eleresi utvonal letrehozasa

            strKonyvtarPath = file.toString() + File.separator;
            list.add(strKonyvtarPath);

            try
            {
                if (file.isDirectory() == false)
                {
                    System.out.println("Hiba: adj meg egy konyvtarat!");
                    System.exit(1);
                }

                List<String> dirs = Directory.recursiveList(file, list); // rekurzivan kilistazza a fileokat

                for (int i = 0; i < dirs.size(); i++)
                {
                    System.out.println("DEBUG\t" + dirs.get(i)); // informacio kiiratasa
                }

                for (int i = 0; i < dirs.size(); i++)
                {
                    List<String> kepfajlok = Directory.getPhotos(dirs.get(i)); // kilistazza a kepeket

                    for (String kepfajl : kepfajlok)
                    {
                        HTML.createHtmlForPhotos(dirs.get(i), kepfajl); // letrehoz egy ures html fajlt
                    }

                    for (String kepfajl : kepfajlok)
                    {
                        HTML.changeHtmlForPhoto(dirs.get(i), kepfajl, konyvtarPath); // kicsereli az ures html fileokat a a kepek html file-ara
                    }

                    HTML.createIndexHtml(dirs.get(i) + File.separator, konyvtarPath); // letrehozzza az index html fileokat
                }

                HTML.start(konyvtarPath); // letrehozza a startpage-t

                
                
            }
            catch (NullPointerException e)
            {
                System.out.println("Hiba: adj meg egy konyvtarat!");
                System.exit(1);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(args.length == 2 && args[0].toLowerCase().equals("-c")) // ha a "-c" az elso parancsori argomentum akkor:
        {
            konyvtarPath = args[1]; // a gyokerkonyvtar neve
            File file = new File(konyvtarPath); // absztarkt eleresi utvonale letrehozasa

            strKonyvtarPath = file.toString() + File.separator;
            list.add(strKonyvtarPath);

            List<String> dirs = Directory.recursiveList(file, list); // rekurzivan kilistazza a fileokat

            // html fileok torlese
            try
            {
                Delete.deleteHtmlFiles(dirs);
            }
            catch (NullPointerException e)
            {
                System.out.println("Hiba: adj meg egy konyvtarat!");
                System.exit(1);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Hiba: adj meg egy konyvtarat!");
            System.exit(1);
        }
    }
}