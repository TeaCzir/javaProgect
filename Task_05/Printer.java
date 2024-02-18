package Task_05;

// Не удаляйте этот класс!
// Он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 77;
            op = '*';
            b = 17;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        // Ниже добавить проверку оператора на корректность
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Некорректный оператор: " + op);
            return;
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}