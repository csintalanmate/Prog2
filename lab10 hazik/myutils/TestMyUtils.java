public class TestMyUtils
{
    public static void main(String[] args) 
    {
        testduplaz();
        teststrlen();    
    }

    private static void teststrlen()
    {
        assert MyUtils.strlen("abcd") == 4;
        assert MyUtils.strlen("") == 0;
        assert MyUtils.strlen("Éva") == 3;
        System.out.println("OK");
    }

    private static void testduplaz()
    {
        assert MyUtils.duplaz(0) == 0;
        assert MyUtils.duplaz(1) == 2;
        assert MyUtils.duplaz(2) == 4;
        assert MyUtils.duplaz(5) == 10;
        assert MyUtils.duplaz(-2) == -4;
        assert MyUtils.duplaz(-10) == -20;
        System.out.println("OK");
    }    
}
