using System;
using System.Diagnostics;

class Program
{
    static void Main()
    {
        Stopwatch sw = Stopwatch.StartNew();

        // Code to measure
        for (int i = 0; i < 1000000; i++)
        {
            Math.Sqrt(i);
        }

        sw.Stop();
        Console.WriteLine($"Elapsed Time: {sw.ElapsedMilliseconds} ms");
    }
}
