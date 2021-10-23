package Hamsa.assignments20;

import java.util.Scanner;

public class assignment20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cat cat1 = new Cat();
        cat1.catInfo("Persian cat", "white", 2);
        cat1.sleep();
        cat1.eat();
        cat1.age();
        cat1.move("not");
        System.out.println(">>>>>>>>>>>>>>2<<<<<<<<<<<<<<<");
        Birds bird = new Birds();
        bird.setBirdInfo("Parrot", "purple", 2);
        bird.sleep();
        bird.eat("fruits");
        bird.drink();
        bird.fly("high");
        System.out.println(">>>>>>>>>>>>>>3<<<<<<<<<<<<<<<");
        SDET employee1 = new SDET();
        employee1.setSDETInfo("Hamsa", 764762476427L, 5000.00, "Google");
        employee1.testing("Manual");
        employee1.creatingTicket(false);
        System.out.println(">>>>>>>>>>>>>>3<<<<<<<<<<<<<<<");
        BankAccount client1 = new BankAccount();
        client1.setBankPersonalInfo("Hamsa Elyas", 76418768476576L, 2000.00);
        System.out.println("Do you want to Deposit answer with yes/no :");
        String userEntry = input.nextLine();
        if (userEntry.equalsIgnoreCase("yes")) {
            System.out.print("Enter the deposit amount ");
            double amount = input.nextDouble();
            client1.deposit(amount);
        } else if (userEntry.equalsIgnoreCase("no")) {
            System.out.println("Do you want to withdraw answer with yes/no :");
            String userEntry2 = input.nextLine();
            if (userEntry2.equalsIgnoreCase("yes")) {
                System.out.print("Enter the withdraw amount ");
                double amount1 = input.nextDouble();
                client1.withDraw(amount1);
            } else {
                System.out.println("do you want to check your balance yes/no :");
                String userEntry3 = input.nextLine();
                if (userEntry3.equalsIgnoreCase("yes")) {
                    client1.totalBalance();
                }
                else System.out.println("Thank you for being a valued customer");
            }
            System.out.println("Thank you for being a valued customer");
        }
    }
}
