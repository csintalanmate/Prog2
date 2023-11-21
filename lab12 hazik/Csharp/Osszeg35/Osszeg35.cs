using System;

namespace Osszeg35
{
    class Osszeg1000
    {
        public static void Main(string[] args)
        {
            int limit = 1000;
            int sum = OsszegHaromOt(limit);

            Console.WriteLine("Az 1000-nél kisebb 3-mal vagy 5-tel oszthatoó számok összege: " + sum);
        }

        private static int OsszegHaromOt(int limit)
        {
            int sum = 0;

            for (int i = 0; i < limit; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                {
                    sum += i;
                }
            }

            return sum;
        }
    }
}    