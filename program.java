
class Answer {
    public void printPrimeNums() {
        @SuppressWarnings("unused")
        int min = 2;
        @SuppressWarnings("unused")
        int max = 1001;
        @SuppressWarnings("unused")
        Answer random = new Answer();
        for (int i = 2; i < 1001; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
    }
}

class Printer {
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}

// 2е решение

// class Answer { public void printPrimeNums(){

// boolean isPrime;
// Answer random = new Answer();
// for (int i = 1; i < 1001; i++) {
// isPrime = false;
// for (int j = 2; j < i / 2; j++) {
// if ((i%j) == 0)
// {
// isPrime = true;
// }
// }
// if (isPrime == false)
// {
// System.out.println(i+ " ");
// }
// }
// } }

// class Printer{ public static void main(String[] args) {

// Answer ans = new Answer();
// ans.printPrimeNums();
// } }

// 3е решение

// class Answer {
// public static void printPrimeNums() {
// // Напишите свое решение ниже

// // Проход начинается с 2, т.к. это число является наименьшим простым
// for (int i = 2; i <= 1000; i++) {

// boolean isPrime = true;

// // Проверка, является ли число i простым
// // Проход по циклу до корня числа,
// // т.к. дальше нет смысла искать, делителей нет.
// for (int j = 2; j <= Math.sqrt(i); j++) {
// if (i % j == 0) {
// isPrime = false;
// break;
// }
// }
// // Если число i простое, вывод его на экран
// if (isPrime)
// System.out.println(i);
// }
// }
// }

// public class Printer{
// public static void main(String[] args) {

// Answer ans = new Answer();
// ans.printPrimeNums();
// }
// }
