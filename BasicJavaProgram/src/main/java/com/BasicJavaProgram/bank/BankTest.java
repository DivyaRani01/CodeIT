package com.bank;

//Bank class as superclass
class Bank {
 // Common method
 public void deposit(double amount) {
     System.out.println("Depositing " + amount + " in Bank account");
 }
}

//HDFC class as subclass
class HDFC extends Bank {
 // Override deposit method
 @Override
 public void deposit(double amount) {
     System.out.println("Depositing " + amount + " in HDFC account");
 }
}

//ICICI class as subclass
class ICICI extends Bank {
 // Override deposit method
 @Override
 public void deposit(double amount) {
     System.out.println("Depositing " + amount + " in ICICI account");
 }
}

//Main class to test Bank and its subclasses
public class BankTest {
 public static void main(String[] args) {
     // Create Bank object and call deposit method
     Bank bank = new Bank();
     bank.deposit(5000);

     // Create HDFC object and call deposit method
     HDFC hdfc = new HDFC();
     hdfc.deposit(5000);

     // Create ICICI object and call deposit method
     ICICI icici = new ICICI();
     icici.deposit(5000);
 }
}
