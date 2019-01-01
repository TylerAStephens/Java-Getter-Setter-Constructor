package com.TylerStephens;

public class Main {

    public static void main(String[] args) {

        BankAccount tyler = new BankAccount(123, 100,
                "Tyler Stephens", "email@yahoo.com",
                "407-555-0123");

        System.out.println("Tyler's bank account number is " + tyler.getAccountNumber()
        + " with a balance of " + tyler.getBalance());
        System.out.println("Tyler's name on the account is " + tyler.getCustomerName());
        System.out.println("Tyler's contact information is, email: " + tyler.getEmail() +
                " phone number: " + tyler.getPhoneNumber()) ;

        tyler.deposit(100);
        tyler.withdrawal(50);


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Mike", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Nate", 100.00,
                "nate@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}
