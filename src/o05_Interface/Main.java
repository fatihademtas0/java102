package o05_Interface;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price : ");
        double price = input.nextDouble();

        System.out.print("Enter card number : ");
        String cardNumber = input.nextLine();

        System.out.print("Enter expire date : ");
        String expireDate = input.nextLine();

        System.out.print("Enter cvc : ");
        String cvc = input.nextLine();

        System.out.println("1 - A Bank");
        System.out.println("2 - B Bank");
        System.out.println("3 - C Bank");

        System.out.print("Select a bank : ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                ABank aPos = new ABank("QNB", "12345", "12345");
                aPos.connect("127.0.0.1");
                aPos.payment(price, cardNumber, expireDate, cvc);
                break;
            case 2:
                BBank bPos = new BBank("Garanti", "12345", "1234");
                bPos.connect("127.0.1.1");
                bPos.payment(price, cardNumber, expireDate, cvc);
                break;
            default:
                System.out.println("Try again.");
                break;
        }
    }
}
