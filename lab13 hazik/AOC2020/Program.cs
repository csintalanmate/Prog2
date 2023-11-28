using static System.Console;

namespace Example;

public class Program
{
    public static void Main(string[] args)
    {
        List<int> szamok = FileUtils.ReadLinesAsInts("input.txt");
        // for (int i = 0; i < szamok.Count-1; i++)
        // {
        //     for (int j = i; j < szamok.Count; j++)
        //     {
        //         if (szamok[i] + szamok[j] == 2020)
        //         {
        //             WriteLine(szamok[i] * szamok[j]);
        //         }
        //     }
        // }

        for (int i = 0; i < szamok.Count - 2; i++)
        {
            for (int j = i; j < szamok.Count-1; j++)
            {
                for (int k = j; k < szamok.Count; k++)
                {
                    if (szamok[i] + szamok[j] + szamok[k] == 2020)
                    { 
                        WriteLine(szamok[i] * szamok[j]* szamok[k]);
                    }
                }
            }
        }
    }
}