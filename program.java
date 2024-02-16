import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Введите первое число: ");
        System.out.print("Введите чилсо == n == : ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Number(i));
        iScanner.close();
    }

    public static int Number(int a) {
        return (a * (a + 1)) / 2;
    }
}