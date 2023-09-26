import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        float sima = 45.739f;
        int kerekites = Math.round(sima);
        System.out.println(sima + " egeszre kerekitve: " + kerekites);

        double x = 4.9783;
        double sinus = Math.sin(x);
        System.out.println(x + " sinusza: " + sinus);

        double rad = 0.314;
        double szog = Math.toDegrees(rad);
        System.out.println(rad + " radian szogbeli erteke: " + szog);
        
        double szam = 987;
        double cuberoot = Math.cbrt(szam);
        System.out.println(szam + " köbgyöke: " + cuberoot);

        int elso = 56, masodik = 49;
        int nagyobb = Math.max(elso,masodik);
        System.out.println(elso + " es " + masodik + " kozul a nagyobb: " + nagyobb);
    }
}