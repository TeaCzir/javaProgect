/*
* Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
* Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
*/
package Task_01;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printName();
    }

    static void printName() {
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет дорогой наш: " + name + "!");
        System.out.printf("Здравствуйте: %.5s!\n", name);
        System.out.println("HELLO WORLD!");

    }
}
