import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static final List<Character> letters = new ArrayList<>(List.of('a','b','c'));
	public static final List<Integer> numbers = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9));

	public static void main(String[] args)
    {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a sorok szamat: ");
        int rows = scanner.nextInt();

        System.out.print("Adja meg az oszlopok szamat: ");
        int columns = scanner.nextInt();


		for (int i = 0; i < columns; i++)
		{
			for (int j = 0; j < rows; j++)
			{
				System.out.print(letters.get(r.nextInt(3)).toString() + numbers.get(r.nextInt(10)).toString() + " ");
			}
			System.out.println();
		}
    }
}