import java.util.List;

public class TestVerem
{
    public static void main(String[] args)
    {
        testsize();
        testappend();
        testpop();
    }

    private static void testpop()
    {
        Verem v = new Verem(List.of(1, 2, 3));
        assert v.pop() == 2;
        assert v.pop() == 1;
        assert v.pop() == 0;
        System.out.println("OK");
    }

    private static void testappend()
    {
        Verem v = new Verem();
        assert v.isEmpty();
        v.append(96);
        assert v.size() == 1;
        System.out.println("OK");
    }

    private static void testsize()
    {
        Verem v = new Verem();
        assert v.isEmpty();
        v.append(1);
        assert v.size() == 1;
        System.out.println("OK");
    }
    
}
