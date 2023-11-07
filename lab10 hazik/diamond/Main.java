public class Main
{
    public static void main(String[] args)
    {
        int test1 = 0;
        int test2 = 3;
        int test3 = 8;
        int test4 = 23;

        diamond(test1);
        System.out.println("---");
        diamond(test2);
        System.out.println("---");
        diamond(test3);
        System.out.println("---");
        diamond(test4);
    }

    public static void diamond(int height)
    {
        if (height % 2 == 0)
        {
            System.err.println("Hibás paraméter: A diamond magasságának páratlannak kell lennie!");
            return;
        }

        for (int i = 1; i <= height; i += 2)
        {
            int spaces = (height - i) / 2;
            space(spaces);
            star(i);
            System.out.println();
        }

        for (int i = height - 2; i > 0; i -= 2)
        {
            int spaces = (height - i) / 2;
            space(spaces);
            star(i);
            System.out.println();
        }
    }

    public static void star(int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print("*");
        }
    }

    public static void space(int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print(" ");
        }
    }

    
}