import java.util.List;

public class Main 
{
    public static void main(String[] args)
    {
        String fname = "pelda.txt";
        String sor = FileUtils.readLines(fname).get(0);
        System.out.println(sor);

        List<Integer> digits = FileUtils.readFirstLineAsListOfDigits(fname);
        System.out.println(digits.toString());

        int sum = 0;

        for (int i = 0; i < digits.size() - 1; ++i)
        {
            if (digits.get(i) == digits.get(i+1))
            {
                sum = sum + digits.get(i);
            }
        }

        if (digits.get(0) == digits.get(digits.size() - 1))
        {
            sum = sum + digits.get(0);
        }

        System.out.println("A szamjegyek osszege: " + sum);
    }
}
