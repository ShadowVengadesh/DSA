//efficient diviser counter code
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
