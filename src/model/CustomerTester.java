package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerTester {


    HashMap<String, Customer> customers = new HashMap<String, Customer>();

    public void addCustomer(String email, String firstName, String lastName) {
        customers.put(email, new Customer(firstName, lastName, email));
    }

    public Customer getCustomer(String customerEmail) {
        return customers.get(customerEmail);
    }

    public Collection<Customer> getAllCustomers() {
        return customers.values();
    }

    public static void main(String[] args) {
        addCustomer("justinkim36@naver.com", "Joon", "Kim");

    }
}
