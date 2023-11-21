import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        String filename = "input.txt";
        List<String> lines = FileUtils.readLines(filename);
        Map<String, Integer> result = new HashMap<>();

        for (String line : lines)
        {
            String parts[] = line.split(" ");
            for (String part : parts)
            {
                if (result.containsKey(part))
                {
                    result.put(part, result.get(part) + 1);
                } else
                {
                    result.put(part, 1);
                }
            }
        }

        int maxValue = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> e : result.entrySet())
        {
            System.out.println(e.getKey() + ": " + e.getValue());
            if (e.getValue() != null && e.getValue() > maxValue)
            {
                maxKey = e.getKey();
                maxValue = e.getValue();
            }
        }

        System.out.println("\n\nLeggyakoribb szo: " + maxKey + " Elofordulasa: " + maxValue);
    }
}