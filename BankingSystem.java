import java.util.Scanner;

public class BankingSystem {

    private double balance;

    public BankingSystem() {
        balance = 5000.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of Rs" + amount + " successful.");
        } else {
            System.out.println("Please check the balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance in savings account is: Rs" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingSystem account = new BankingSystem();
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Please select the correct option: ");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter amount to deposit: Rs ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: Rs ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking services.");
                    break;
                default:
                    System.out.println("Please try again");
            }
        }
    }
}
