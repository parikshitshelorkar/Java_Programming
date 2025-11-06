import java.util.Scanner;

import javax.swing.plaf.TreeUI;

class ATM {
    double balance;

    public ATM(double balance) {
        this.balance = balance;

    }

    public void checkBalance() {
        System.out.println("Current Balance is : " + balance);
    }

    public void deposit(double kitiTakayche) {
        if (kitiTakayche < 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        } else {
            balance += kitiTakayche;
            System.out.println("Amount Deposited Successfully..!");
        }

    }

    public void withdraw(double kitiKadhayche) {
        if (kitiKadhayche < 0) {
            // System.out.println("Enter the valid Amount..!");
            throw new ArithmeticException("Insufficient funds! Cannot withdraw ₹" + kitiKadhayche);
        } else if (kitiKadhayche > balance) {
            // System.out.println("The balance is not sufficient..!");
            throw new ArithmeticException("The balance is not sufficient..!");
        } else {
            System.out.println("Enter the amount you want to withdrawal...");
            balance -= kitiKadhayche;
            System.out.println("Amount Withdrawal Successfull..!");
        }
    }

}

public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(100);
        
        while(true){
            try{
            System.out.println("******* WELCOME TO THE ATM SIMULATION *******");
            System.out.println(">>> Select the Relevent Option <<<");
            System.out.println();
            System.out.println("1 : Check balance");
            System.out.println("2 : Deposit Moneyy");
            System.out.println("3 : Withdrawal Moneyy");
            System.out.println("4. Exit");
            System.out.println("");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: atm.checkBalance();
                    
                    break;
                case 2: {
                    double kiti = sc.nextDouble();
                    atm.deposit(kiti);
                    break;
                }
                case 3:{
                    double kiti = sc.nextDouble();
                    atm.withdraw(kiti);
                    break;
                }
                case 4:{
                    sc.close();
                    break;
                }
            
                default:
                    throw new IllegalArgumentException("Invalid menu choice. Please enter 1-4.");
                    
            }
            catch (IllegalArgumentException e) {
                System.out.println("Hi");
                System.out.println("Error: " + e.getMessage());
            }
            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            } finally {
                System.out.println("Operation completed. Returning to main menu...\n");
            }

        }

    }
}
}
