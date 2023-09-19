import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add meg a teglalap egyik oldalat: ");
        int x = sc.nextInt();
        System.out.println("Add meg a teglalap masik oldalat: ");
        int y = sc.nextInt();

        Teglalap teglalap = new Teglalap(x,y);
        int k = teglalap.kerulet();
        int t = teglalap.terulet();
        System.out.println("A teglalap kerulete: "+k+"\nA teglalap területe: "+t);
    }
}
