public class StringUtils
{
    private StringUtils()
    {
        // nem példányosítható
    }

    public static String randomCase(String text)
    {
        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char c : chars)
        {
            if (Math.random() < 0.5)
            {
                sb.append(Character.toLowerCase(c));
            }
            else
            {
                sb.append(Character.toUpperCase(c));
            }
        }

        String result = sb.toString();
        return result;
    }
}