long before = GC.GetTotalMemory(true);

// Code to measure
int[] numbers = new int[1000000];

long after = GC.GetTotalMemory(true);

Console.WriteLine($"Memory Used: {after - before} bytes");
