package Answer;
// ЗДАЧА ЧЕРЕЗ АВТОТЕСТ 
import java.util.Scanner;

class Answer {
    public int countNTriangle(int n) {
        // Введите свое решение ниже
        return (n * (n + 1)) / 2;  // МОЕ РЕШЕНИЕ.
    }

    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;              

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 8;   // ЭТУ СТРОКУ Я ЗАКОМЕНТИРОВАЛ ПЕРЕД ОТПРАВКОЙ НА ПРОВЕРКУ.
        } else {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);

    }
}

// РЕШЕНИЕ ИЗ АВТОТЕСТА:

// class Answer {
//     public int countNTriangle(int n){
// if (n < 1) return -1;
//     int sum = 0;
//     for(int i = 1; i <= n; i++){
//           sum += i;
//     }
//     return sum;
//     }
// }

// public class Printer{ 
//     public static void main(String[] args) { 
//       int n = 0;

//       if (args.length == 0) {
//         n = 4;
//       }
//       else{
//         n = Integer.parseInt(args[0]);
//       }     

//       Answer ans = new Answer(); 
//       int itresume_res = ans.countNTriangle(n);     
//       System.out.println(itresume_res);
//     }
// }