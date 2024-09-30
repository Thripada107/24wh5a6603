public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double initialBalance) {
        if (initialBalance >= 0) {
            savingsBalance = initialBalance;
        } else {
            savingsBalance = 0;
        }
    }
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04); 
        SavingsAccount account = new SavingsAccount(1000);
        account.calculateMonthlyInterest();
        System.out.println("Savings Balance after monthly interest: $" + account.getSavingsBalance());
    }
}
