import java.util.Scanner;

class ATM {
    double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Current Balance is : ₹" + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        } 
        else if (amount > balance) {
            throw new ArithmeticException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Amount Withdrawal Successful!");
    }
}

public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(100);

        while (true) {
            try {
                System.out.println("******* WELCOME TO THE ATM SIMULATION *******");
                System.out.println("1 : Check Balance");
                System.out.println("2 : Deposit Money");
                System.out.println("3 : Withdraw Money");
                System.out.println("4 : Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        atm.deposit(sc.nextDouble());
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        atm.withdraw(sc.nextDouble());
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM!");
                        sc.close();
                        return;

                    default:
                        throw new IllegalArgumentException("Invalid menu choice. Please enter 1-4.");
                }

            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
                sc.nextLine(); // clear buffer
            } finally {
                System.out.println("Operation completed.\n");
            }
        }
    }
}
