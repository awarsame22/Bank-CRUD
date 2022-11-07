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