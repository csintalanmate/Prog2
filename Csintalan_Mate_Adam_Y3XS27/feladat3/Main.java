public class Main
{
    public static void main(String[] args)
    {
        if(args.length != 3)
        {
            System.out.println("Hiba: adj meg három egész értéket!");
            System.exit(1);
        }
        //else
        int elso = Integer.parseInt(args[0]);
        int masodik = Integer.parseInt(args[1]);
        int harmadik = Integer.parseInt(args[2]);

        if(elso + masodik > harmadik && elso + harmadik > masodik && masodik + harmadik > elso && (elso * elso + masodik * masodik == harmadik * harmadik || masodik * masodik + harmadik * harmadik == elso * elso || elso * elso + harmadik * harmadik == masodik * masodik))
        {
            System.out.println("derékszögű");
        }
        else if(elso + masodik > harmadik && elso + harmadik > masodik && masodik + harmadik > elso && (elso * elso + masodik * masodik != harmadik * harmadik || masodik * masodik + harmadik * harmadik != elso * elso || elso * elso + harmadik * harmadik != masodik * masodik))
        {
            System.out.println("megszerkeszthető, de nem derékszögű");
        }
        else
        {
            System.out.println("nem szerkeszthető meg");
        }
    }
}