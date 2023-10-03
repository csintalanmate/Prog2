public class Main
{
    public static void main(String[] args)
    {
        String text1 = "123"; // -> long
        String text2 = "3.14"; // -> float
        String text3 = "7.89"; // -> double
        String text4 = "a"; // -> char

        long result1 = Long.parseLong(text1);
        float result2 = Float.parseFloat(text2);
        double result3 = Double.parseDouble(text3);
        char result4 = text4.charAt(0);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}