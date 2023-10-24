public class Main
{
    public static void main(String[] args)
    {
        String text = PyUtils.input("Text: ");
        String result = StringUtils.randomCase(text);
        System.out.printf("%s\n", result);

    }
}