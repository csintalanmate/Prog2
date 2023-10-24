import java.util.Scanner;

public class PyUtils
{
    private PyUtils()
    {
        // nem peldanyosithato
    }

    public static String input(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String text = sc.nextLine();
        return text;
    }
}