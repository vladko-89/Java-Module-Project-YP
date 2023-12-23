import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static double verifyDouble() {
        boolean verifyDouble = false;
        double res = 0;

        while (!verifyDouble) {
            if (scanner.hasNextDouble()) {
                verifyDouble = true;
                res = scanner.nextDouble();
            } else {
                System.out.println("Не тот формат ввода. Повторите");
                scanner.nextLine();
            }
        }
        return res;
    }

    public static int verifyInt() {
        boolean verify = false;
        int res = 0;

        while (!verify) {
            if (scanner.hasNextInt()) {
                verify = true;
                res = scanner.nextInt();
            } else if (scanner.hasNextInt() && scanner.nextInt() < 2) {
                System.out.println("Значение должно быть больше или равно 2");
                scanner.nextLine();
            } else {
                System.out.println("Не тот формат ввода. Введите целое число");
                scanner.nextLine();
            }
        }
        return res;
    }


}
