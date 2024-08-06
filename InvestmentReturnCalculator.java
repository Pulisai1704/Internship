import java.util.Scanner;

public class InvestmentReturnCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        System.out.print("Enter the investment time horizon (in years): ");
        int investmentYears = scanner.nextInt();
        int investmentMonths = investmentYears * 12;

        // Calculate future value
        double futureValue = principal * Math.pow(1 + monthlyInterestRate, investmentMonths);

        System.out.printf("Future Value: %.2f%n", futureValue);
    }
}
