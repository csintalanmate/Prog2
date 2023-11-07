public class TestMain
{
    public static void main(String[] args)
    {
        testproduct();    
    }

    private static void testproduct()
    {
        assert Main.product(0) == 0;
        assert Main.product(2) == 2;
        assert Main.product(0, 2) == 0;
        assert Main.product(10, 10) == 100;
        assert Main.product(10, 20, 30) == 6000;
        assert Main.product(1,2,3,4,5,6) == 720;
        assert Main.product(-4, 5) == -20;
        System.out.println("OK");

    }
    
}
