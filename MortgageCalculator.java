import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (loan amount): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        System.out.print("Enter the loan term (in years): ");
        int loanTermYears = scanner.nextInt();
        int loanTermMonths = loanTermYears * 12;

        // Calculate monthly payment
        double monthlyPayment = (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        System.out.printf("Monthly Mortgage Payment: %.2f%n", monthlyPayment);
    }
}
