import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();

        // Calculate tax based on predefined tax slabs
        double tax = calculateIncomeTax(annualIncome);

        System.out.printf("Estimated tax liability: $%.2f%n", tax);
    }

    public static double calculateIncomeTax(double income) {
        // Define tax slabs and rates (customize as needed)
        double[] maxIncome = {0, 9075, 36900, 89350, 186350, Double.MAX_VALUE};
        double[] taxRate = {0, 0.10, 0.15, 0.25, 0.28, 0.33};

        double remainingIncome = income;
        double totalTax = 0.0;

        for (int i = 1; i < maxIncome.length; i++) {
            double slabIncome = Math.min(maxIncome[i] - maxIncome[i - 1], remainingIncome);
            totalTax += slabIncome * taxRate[i];
            remainingIncome -= slabIncome;
        }

        return totalTax;
    }
}
