import java.util.List;
import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
    {
        int result1 = RandUtils.randint(3, 8);
        int result2 = RandUtils.randrange(10, 20);
        int result3 = RandUtils.choice(List.of(19, 24, 35, 48, 55, 67, 71, 83, 90));

        System.out.println("Random szam 3-tol 8-ig(a 8-as is benne van): " + result1);
        System.out.println("---");
        System.out.println("Random szam 10-tol 20-ig(a 20-as mar nincs benne): " + result2);
        System.out.println("---");
        System.out.println("Random elem a listabol: " + result3);
        System.out.println("---");
    }
}
