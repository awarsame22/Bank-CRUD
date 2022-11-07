import java.util.HashMap;
import java.util.Scanner;
public class Bank {
    HashMap<Integer, Transaction> transactions = new HashMap<>();
    String choice;

    Transaction transaction;
    public void createMethod() {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter 'C' to create a transaction");
            System.out.println("Enter 'R' to read your transactions");
            System.out.println("Enter 'U' to update a transaction");
            System.out.println("Enter 'D' to delete a transaction");
            System.out.println("Enter 'S' to save your transactions");
            System.out.println("Enter 'Q' to quit");
            choice = scan.nextLine();

            if (choice.equalsIgnoreCase("C")) {
                System.out.println("Enter the id of your transaction: ");
                int id = Integer.parseInt(scan.nextLine());
                System.out.println("Enter the name of the account holder: ");
                String name = scan.nextLine();
                System.out.println("Enter the description of your transaction: ");
                String description = scan.nextLine();
                System.out.println("Enter the price of your transaction: ");
                double price = Double.parseDouble(scan.nextLine());

                transaction = new Transaction(id, name, description, price);
                transactions.put(id, transaction);
                System.out.println(transactions);
            } else if (choice.equalsIgnoreCase("R")) {
                //print
                System.out.println(transactions);
            }else if (choice.equalsIgnoreCase("U")) {
                //update
                System.out.println("Enter the id of the transaction you would like to update: ");
                int id = Integer.parseInt(scan.nextLine());
                Transaction transactionToUpdate;

                System.out.println("Enter the name of the account holder: ");
                String newName = scan.nextLine();
                System.out.println("Enter the description of the transaction: ");
                String newDescription = scan.nextLine();
                System.out.println("Enter the price of the transaction: ");
                double newPrice = Double.parseDouble(scan.nextLine());
                transactionToUpdate = new Transaction(id, newName, newDescription, newPrice);

                transactions.replace(id, transaction, transactionToUpdate);
                System.out.println(transactions);
            }else if (choice.equalsIgnoreCase("D")) {
                //delete
                System.out.println("Enter the id of the transaction you would like to delete: ");
                int idToRemove = Integer.parseInt(scan.nextLine());
                transactions.remove(idToRemove);
                System.out.println(transactions);
            }else if (choice.equalsIgnoreCase("S")) {
                //save
            } else if (choice.equalsIgnoreCase("Q")) {
                break;
            } else
                System.out.println("Invalid input, please select an option from the menu.");
        }     while(true);

    }
}