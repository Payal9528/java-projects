
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. View Account\n5. View All\n0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Deposit: ");
                    double deposit = sc.nextDouble();
                    bank.createAccount(accNo, name, deposit);
                    break;
                case 2:
                    System.out.print("Account No: ");
                    accNo = sc.nextInt();
                    Account acc = bank.findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Amount to deposit: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                    } else System.out.println("Account not found.");
                    break;
                case 3:
                    System.out.print("Account No: ");
                    accNo = sc.nextInt();
                    acc = bank.findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Amount to withdraw: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    } else System.out.println("Account not found.");
                    break;
                case 4:
                    System.out.print("Account No: ");
                    accNo = sc.nextInt();
                    acc = bank.findAccount(accNo);
                    if (acc != null) acc.display();
                    else System.out.println("Account not found.");
                    break;
                case 5:
                    bank.showAllAccounts();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
