public class Calculate {
    static double totalCost;

    public static void sum(double item) {
        totalCost += item;
        System.out.println(totalCost);
    }

    public static double getResult(int count) {
        return totalCost / count;
    }
}
