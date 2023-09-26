import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] tomb = { 93, 122, 42, 91, 17 };

        System.out.println("Tomb: " + Arrays.toString(tomb));    

        MyArrayUtils.sortDescending(tomb);

        System.out.println("Csokkeno sorrendbe rendezve: " + Arrays.toString(tomb));
        
        int[] tomb2 = { 145, 7 , 93, 23, 65 };

        System.out.println("Egy masik tomb: " + Arrays.toString(tomb2));

        MyArrayUtils.reverse(tomb2);

        System.out.println("A masik tomb megforditva: " + Arrays.toString(tomb2));

        boolean egyenlo = MyArrayUtils.equals(tomb, tomb2);

        if (egyenlo)
        {
            System.out.println("Az elso ket tomb megegyezik");
        }
        else
        {
            System.out.println("Az elso ket tomb nem egyezik meg");
        }

        int[] tomb3 = {0, 0, 0, 0, 0};

        System.out.println("Egy ujabb tomb tele nullasokkal: " + Arrays.toString(tomb3));

        MyArrayUtils.fill(tomb3, 5);

        System.out.println("A tomb feltoltve 5-osokkel" + Arrays.toString(tomb3));
    }
}