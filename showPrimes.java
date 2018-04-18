import java.util.Scanner;

public class showPrimes {
    public static void main(String[] args) {
        System.out.println("prime numbers from one to one hundred");

        for (int number = 2; number < 100; number++) {
            boolean check = true;
            int i = 2;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("primes are is: " + number);
            }
        }
    }
}