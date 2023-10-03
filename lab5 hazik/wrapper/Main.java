public class Main 
{
    public static void main(String[] args)
    {
        Character x = 'c';
        Character y = 'z';

        System.out.println("A c karakter betu-e : " + Character.isLetter(x));
        System.out.println("A z karakter nagybetus-e : " + Character.isUpperCase(y));

        Integer ertek1 = 12;
        Integer ertek2 = 67;

        System.out.println("A 12 es a 67 kozt melyik a nagyobb: " + Integer.max(ertek1, ertek2));
        System.out.println("A 12 es a 67 szamok egyenlok-e: " + Integer.compare(ertek1, ertek2));

        Double ertek3 = 98.3;
        Double ertek4 = 56.7;

        System.out.println("A 98.3 es az 56.7 szamok osszege: " + Double.sum(ertek3, ertek4));
        System.out.println("A 98.3 vegtelen nagy-e: " + Double.isInfinite(ertek3));

        Boolean hamis = false;
        Boolean igaz = true;

        System.out.println("Az igaz es a hamis erteke logikai ES-kent osszekapcsolva: " + Boolean.logicalAnd(hamis, igaz));
        System.out.println("Az igaz es a hamis erteke logikai KIZARO VAGY-kent osszekapcsolva: " + Boolean.logicalXor(hamis, igaz));
    }
}
