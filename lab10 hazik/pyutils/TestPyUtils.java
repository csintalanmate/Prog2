import java.util.ArrayList;
import java.util.List;

public class TestPyUtils
{
    public static void main(String[] args)
    {
        testrange();
    }

    private static void testrange()
    {
        assert PyUtils.range(0).equals(List.of());
        assert PyUtils.range(0, 5).equals(List.of(0, 1, 2, 3, 4));
        assert PyUtils.range(20, 30, 2).equals(List.of(20, 22, 24, 26, 28));
        assert PyUtils.range(7).equals(List.of(0, 1, 2, 3, 4, 5, 6));
        assert PyUtils.range(10, 4, 1).equals(List.of());
        System.out.println("OK");
    }
    
}