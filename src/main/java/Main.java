
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите количество гостей");

        int countPerson = Validator.verifyInt();

        String event = "";

        while (!event.contains("завершить")) {
            System.out.println("Введите наименование товара");
            String name = scanner.next();
            System.out.println("Введите стоимость товара");
            double cost = Validator.verifyDouble();
            String currency = Formatter.formate((int) Math.floor(cost));


            Cart.addPurchase(name, cost, currency);
            Calculate.sum(cost);

            System.out.println("Добавить новый товар? Чтобы перейти к расчету введите 'Завершить'");
            event = scanner.next();

        }
        Cart.printPurchaseList();
        double partPayment = Calculate.getResult(countPerson);
        String currency = Formatter.formate((int) Math.floor(partPayment));
        System.out.println("Нужно оплатить по " + String.format("%.2f", partPayment) + currency);
    }

}