package application.model;

import application.model.entities.Account;
import application.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account Data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            Double limit = sc.nextDouble();
            Account account = new Account(number, name, balance, limit);
            System.out.println(account);
            System.out.println("=============================");

            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            account.withDraw(amount);

            System.out.println("new balance: " + account.getBalance());

        }catch (DomainException e){
            System.out.println("Error: " + e.getMessage());
        }




    }
}