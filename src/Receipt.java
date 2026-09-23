import java.text.DecimalFormat;
public class Receipt {
    public static void main(String[] args) {
        System.out.println(" ");
        String customerName = "Stacey";
        System.out.println("Customer name: " + customerName);
        System.out.println(" ");

        int applesPurchased = 12;
        double applePrice = 0.6;
        int pineapplesPurchased = 2;
        double pineapplePrice = 3.59;
        int riceBags = 3;
        double ricePoundPrice = 1.39;
        final int WEIGHT_OF_BAG = 2; //kilograms.
        final double POUNDS_IN_A_KILO = 2.20462;

        double appleCost = applePrice * applesPurchased;
        double pineappleCost = pineapplePrice * pineapplesPurchased;
        double riceCost = WEIGHT_OF_BAG * POUNDS_IN_A_KILO * ricePoundPrice * riceBags;
        DecimalFormat df = new DecimalFormat("0.00");
        String appleCostRounded = df.format(appleCost);
        String pineappleCostRounded = df.format(pineappleCost);
        String riceCostRounded = df.format(riceCost);

        System.out.println(applesPurchased + " apples - $" + appleCostRounded);
        System.out.println(pineapplesPurchased + " pineapples - $" + pineappleCostRounded);
        System.out.println(riceBags + " bags of rice - $" + riceCostRounded);

        double totalCost = appleCost + pineappleCost + riceCost;
        String totalCostRounded = df.format(totalCost);
        System.out.println("Total: $" + totalCostRounded);
        double averageCost = totalCost / (applesPurchased + pineapplesPurchased + riceBags);
        String averageCostRounded = df.format(averageCost);
        System.out.println("Average cost: $" + averageCostRounded + " per item");

        int tender = 40;
        System.out.println("Cash tendered: $" + tender);
        double change = tender - totalCost;
        String changeRounded = df.format(change);
        System.out.println("Change: $" + changeRounded);
    }
}