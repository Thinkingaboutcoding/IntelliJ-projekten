package Schleifen_09_12_23;

public class ForSchleifenSchweriger {
    public static void main(String[] args) {
        sumOfFirst50Primes();
        fibonacciNumbers();
        calculateFactorials();
        sumOfOddSquares();
        productOfFirst8EvenNumbers();
    }

    private static void sumOfFirst50Primes() {
        int primeCount = 0;
        long sumOfPrimes = 0;
        for (int num = 2; primeCount < 50; num++) {
            if (isPrime(num)) {
                sumOfPrimes += num;
                primeCount++;
            }
        }
        System.out.println("Summe der ersten 50 Primzahlen: " + sumOfPrimes);
    }

    private static void fibonacciNumbers() {
        int n = 10;
        int firstFibonacci = 0;
        int secondFibonacci = 1;
        System.out.print("Fibonacci-Zahlen bis zur 10. Position: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstFibonacci + " ");
            int nextFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = nextFibonacci;
        }
        System.out.println();
    }

    private static void calculateFactorials() {
        System.out.print("Fakultät für die Zahlen von 1 bis 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(factorial(i) + " ");
        }
        System.out.println();
    }

    private static void sumOfOddSquares() {
        int sumOfOddSquares = 0;
        for (int num = 1; num <= 15; num += 2) {
            sumOfOddSquares += num * num;
        }
        System.out.println("Summe der Quadratzahlen der ungeraden Zahlen von 1 bis 15: " + sumOfOddSquares);
    }

    private static void productOfFirst8EvenNumbers() {
        long productOfEvenNumbers = 1;
        for (int num = 2; num <= 16; num += 2) {
            productOfEvenNumbers *= num;
        }
        System.out.println("Produkt der ersten 8 geraden Zahlen: " + productOfEvenNumbers);
    }

    // Helper methods

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
