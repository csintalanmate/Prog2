import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class HTML
{

    // Letrehoz ures html-eket
    public static void createHtmlForPhotos(String kepPath, String kep)
    {
        int pont = kep.indexOf(".");
        String kitNelkul = kep.substring(0, pont);
        String htmlKep = kitNelkul + ".html";

        try
        {
            PrintWriter pr = new PrintWriter(kepPath + htmlKep);
            pr.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    // kepek html file letrehozasa
    public static void changeHtmlForPhoto (String kepPath, String kep, String kepRootDir)
    {
        List<String> htmlFiles = Directory.listHtml(kepPath);

        int index = 0;
        int position = 0;
        int pont = kep.indexOf(".");

        String[] mappak = kepPath.split(File.separator + File.separator);
        String oldalNev = mappak[mappak.length-1];
        String kitNelkul = kep.substring(0, pont);
        String htmlKep = kitNelkul + ".html";

        htmlFiles.remove("index.html");

        for (int i = 0; i < htmlFiles.size(); i++)
        {
            if (htmlFiles.get(i).equals(htmlKep))
            {
                index = i;
            }
        }

        String[] rootDirArr = kepRootDir.split(File.separator + File.separator);
        String[] pathArr = kepPath.split(File.separator + File.separator);
        position = pathArr.length - rootDirArr.length;


        try (PrintWriter writer = new PrintWriter(kepPath + htmlKep))
        {
            StringBuilder sb = new StringBuilder();

            sb.append(String.format("""
                <html>
                    <head>
                        <meta charset="utf-8"/>
                        <title> %s </title>
                    </head>
                    <body style="background-color: #FFFFFF">
                    <body>
                        <h1> <a href=" """, oldalNev));

            for (int i = 0; i < position; i++)
            {
                sb.append("..\\");
            }

            sb.append("""
                index.html">Start Page</a></h1>
                        <hr>
                            <p><a href="index.html">^^</a></p>
                """);
            if (htmlFiles.size() == 1)
            {
                sb.append(String.format("""
                            <p> <a href="%s"> << </a> %s <a href="%s"> >> </a> </p>
                            <p> <a href="%s"> <img alt="" src="%s"  width="500" height="500"/> </a> </p>
                """,htmlFiles.get(index),kep,htmlFiles.get(index),htmlFiles.get(index),kep));
            }
            else if (index == 0)
            {
                sb.append(String.format("""
                            <p> <a href="%s"> << </a> %s <a href="%s"> >> </a> </p>
                            <p> <a href="%s"> <img alt="" src="%s"  width="500" height="500"/> </a> </p>
                """,htmlFiles.get(index),kep,htmlFiles.get(index+1),htmlFiles.get(index+1),kep));

            }
            else if (index == htmlFiles.size() - 1)
            {
                sb.append(String.format("""
                            <p> <a href="%s"> << </a> %s <a href="%s"> >> </a> </p>
                            <p> <img alt="" src="%s"  width="500" height="500"/> </a> </p>
                """,htmlFiles.get(index-1),kep,htmlFiles.get(index),kep));
            }
            else
            {
                sb.append(String.format("""
                            <p> <a href="%s"> << </a> %s <a href="%s"> >> </a> </p>
                            <p> <a href="%s"> <img alt="" src="%s"  width="500" height="500"/> </a> </p>
                """,htmlFiles.get(index-1),kep,htmlFiles.get(index+1),htmlFiles.get(index+1),kep));
            }

            sb.append("\t</body>\n");
            sb.append("</html>");

            writer.println(sb.toString());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    // index.html fileok letrehozasa (a StartPagen kivul)
    public static void createIndexHtml(String kepPath, String kepRootDir)
    {
        String aktualis = kepPath + "index.html";

        String[] mappak = kepPath.split(File.separator + File.separator);
        String oldalNev = mappak[mappak.length - 1];

        List<String> files = Directory.getPhotos(kepPath);
        List<String> directories = Directory.listDirectories(kepPath);

        int position;
        String[] rootDirArr = kepRootDir.split(File.separator + File.separator);
        String[] pathArr = kepPath.split(File.separator + File.separator);
        position = pathArr.length - rootDirArr.length;

        try (PrintWriter writer = new PrintWriter(aktualis))
        {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("""
                <html>
                    <head>
                        <meta charset="utf-8"/>
                        <title>%s</title>
                    </head>
                    <body style="background-color: #FFFFFF">
                    <body>
                        <h1> <a href=" """, oldalNev));

            for (int i = 0; i < position; i++)
            {
                sb.append("..\\");
            }

            sb.append("""
                index.html">Start Page</a></h1>
                    <hr>
                    <h2>Directories:</h2>
                        <p> <a href="../index.html">^^</a> </p>
                """);

            for (String directory : directories)
            {
                sb.append("\t\t<p> <a href=\"" + directory + "\\index.html" + "\">" + directory + "</a></p>\n");
            }

            if (directories.size() == 0)
            {
                sb.append("\t\t<p>Nincsenek mappak a mappaban!</p>\n");
            }

            sb.append("\t<hr>\n");
            sb.append("\t<h2>Photos:</h2>\n");

            if (files.size() > 0)
            {
                for (String file : files)
                {
                    int dotPosition = file.indexOf(".");
                    String photoWithoutExtension = file.substring(0, dotPosition);
                    String link = photoWithoutExtension + ".html";
                    sb.append("\t\t<p> <a href=\"" + link + "\">" + file + "</a> </p>\n");
                }
            }

            if (files.size() == 0)
            {
                sb.append("\t\t<p>Nincsenek fajlok a mappaban!</p>\n");
            }

            sb.append("\t</body>\n");
            sb.append("</html>");

            writer.println(sb.toString());
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }

    // Startpage letrehozasa
    public static void start(String kepPath)
    {
        String aktualis = kepPath + "\\index.html";
        String[] mappak = kepPath.split(File.separator + File.separator);
        String oldalNev = mappak[mappak.length - 1];

        List<String> files = Directory.getPhotos(kepPath);
        List<String> directories = Directory.listDirectories(kepPath);

        try (PrintWriter writer = new PrintWriter(aktualis))
        {
            StringBuilder sb = new StringBuilder();

            sb.append(String.format("""
                <html>
                    <head>
                        <meta charset="utf-8"/>
                        <title>%s</title>
                    </head>
                    <body style="background-color: #FFFFFF">
                    <body>
                        <h1>Start Page</h1>
                    <hr>
                    <h2>Directories:</h2>
                """,oldalNev));

            if (directories.size() == 0)
            {
                sb.append("\t\t<p>Nincsenek mappak ebben a mappaban</p>\n");
            }
            else
            {
                for (String directory : directories)
                {
                    sb.append("\t\t<p><a href=\"" + directory + "\\index.html" + "\">" + directory + "</a></p>\n");
                }
            }

            sb.append("\t<hr>\n\t<h2>Photos:</h2>\n");
            if (files.size() == 0)
            {
                sb.append("\t\t<p>Nincsenek fajlok a mappaban!</p>\n");
            }
            else
            {
                for (String file : files)
                {
                    int a = file.indexOf('.');
                    String newName = file.substring(0, a);
                    String link = newName + ".html";
                    sb.append("\t\t<p><a href=\"" + link + "\">" + file + "</a></p>\n");
                }
            }

            sb.append("\t</body>\n");
            sb.append("</html>");

            writer.println(sb.toString());
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
}