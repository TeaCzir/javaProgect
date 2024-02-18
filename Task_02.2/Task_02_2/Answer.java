
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Answer {

    static Scanner iScanner = new Scanner(System.in);

    public void printPrimeNums() {
        // Напишите свое решение ниже
        List<Integer> primes = new ArrayList<>();
        int[] ArrayList = new int[1000];

        for (int i = 2; i <= ArrayList.length; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }

        }
        System.out.print(primes + "\n");
        // System.out.printf("%.1000s", primes, "\n");
        // System.out.println(primes + "\n");

    }

    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
        // System.out.printf("%d\n", ans);
        // System.out.println("Простые числа: " + ans);
        // System.out.print(ans + "\n");

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer {
// public static void main(String[] args) {

// Answer ans = new Answer();
// ans.printPrimeNums();
// }
// }