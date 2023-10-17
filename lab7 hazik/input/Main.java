import java.util.Scanner;

class PyUtils
{
    private PyUtils()
    {
        // nem peldanyosithato
    }

    public static String input(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String text = scanner.nextLine();
        return text;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        String name = PyUtils.input("Neved: ");
        System.out.printf("Hello %s!\n", name);

    }
}