//efficient diviser counter code
//the file can't be run directly it requires some changes
public static int countDivisors(long number) {
    int count = 0;
    long sqrt = (long) Math.sqrt(number);
    for (long i = 1; i <= sqrt; i++) {
        if (number % i == 0) {
            count += 2; // i and number/i
        }
    }
    if (sqrt * sqrt == number) count--; // perfect square fix
    return count;
}
