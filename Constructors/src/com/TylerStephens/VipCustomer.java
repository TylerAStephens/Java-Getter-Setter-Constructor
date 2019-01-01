package com.TylerStephens;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    // Base Constructor
    public VipCustomer() {
        this("VIP Name", 50000.00, "VIP email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
