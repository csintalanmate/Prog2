import java.util.List;
import java.util.Random;

public class RandUtils 
{
    private final static Random r = new Random();

    private RandUtils()
    {
        //nem példányositható
    }

    public static int randint(int also, int felso)
    {
        int intervallum = felso - also + 1;
        int veletlen = r.nextInt(intervallum);
        return also + veletlen;
    }

    public static int randrange(int also, int felso)
    {
        return randint(also, felso - 1);
    }

    public static int choice(List<Integer> lista)
    {
        int random = randint(0, lista.size() - 1);
        int result = lista.get(random);
        
        return result;
    }
}
