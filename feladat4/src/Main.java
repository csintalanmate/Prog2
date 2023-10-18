import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String fname = "games.csv";
        List<String> lines = FileUtils.readLines(fname);
        lines = cleanDataset(lines);
        List<String> konzolok = getConsoles(lines);
        System.out.println("Elérhető konzolok: " + String.join(", ", konzolok));
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Konzol tipusa: ");
        String userInput = sc.nextLine().toUpperCase();
        if (!konzolok.contains(userInput))
        {
            System.out.println(("Hiba! Nincs ilyen konzol!"));
            return;
        }
        //else
        produceStatistics(userInput, lines);
    }

    private static void produceStatistics(String konzol, List<String> lines)
    {
        int cnt = 0;
        int total = 0;
        for (String line : lines)
        {
            String[] parts = line.split(",");
            String currentConsole = parts[0];
            int score = Integer.parseInt(parts[3]);
            if (currentConsole.equals(konzol))
            {
                ++cnt;
                total += score;
            }
        }

        double avg = (double)total / (double) cnt;

        System.out.println("Játékok száma: " + cnt);
        System.out.printf("Átlagos pontszám: %.2f", avg);
    }

    private static List<String> getConsoles(List<String> lines)
    {
        List<String> result = new ArrayList<>();

        for (String line: lines)
        {
            String[] parts = line.split(",");
            String konzol = parts[0];
            if (!result.contains(parts[0]))
            {
                result.add(parts[0]);
            }
        }

        return result;
    }

    private static List<String> cleanDataset(List<String> lines)
    {
        lines.remove(0);
        List<String> result = new ArrayList<>();
        for (String line: lines)
        {
            if (line.contains("\""))
            {
                result.add(line);
            }
        }

        return result;
    }


}