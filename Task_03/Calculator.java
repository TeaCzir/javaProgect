package Task_03;

public class Calculator {

    private static int a = 0;
    private static int b;
    private static int extracted;

    public int calculate(char op, int a, int b) {

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + plus(a, b));
            case '-':
                System.out.println(a + " - " + b + " = " + minus(a, b));
            case '*':
                System.out.println(a + " * " + b + " = " + multi(a, b));
            case '/':
                System.out.println(a + " / " + b + " = " + divide(a, b));
            default:
                System.out.println("Некорректная операция. ");
        }
        return b;

    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0)
            return a / b;
        return -1;
    }

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }

    // }

    // public class Printer {
    /**
     * @param args
     */
    public static void main(Object[] args) {
        char op = ' ';
        extracted = extracted();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры

            a = 3;
            op = '+';
            b = 7;
        } else {
            a = 0;
            op = ' ';
            b = 2;
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }

    private static int extracted() {
        return b = 0;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Calculator.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Calculator.b = b;
    }

    public static int getExtracted() {
        return extracted;
    }

    public static void setExtracted(int extracted) {
        Calculator.extracted = extracted;
    }

    @Override
    public String toString() {
        return "Calculator []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
