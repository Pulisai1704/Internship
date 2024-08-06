import java.util.Scanner;

public class SavingsGoalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your savings goal amount: ");
        double savingsGoal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        System.out.print("Enter the time frame (in years): ");
        int timeFrameYears = scanner.nextInt();
        int timeFrameMonths = timeFrameYears * 12;

        // Calculate the monthly investment needed
        double monthlyInvestment = savingsGoal /
                ((Math.pow(1 + monthlyInterestRate, timeFrameMonths) - 1) / monthlyInterestRate);

        System.out.printf("To reach your savings goal of $%.2f in %d years, invest approximately $%.2f monthly.%n",
                savingsGoal, timeFrameYears, monthlyInvestment);
    }
}
