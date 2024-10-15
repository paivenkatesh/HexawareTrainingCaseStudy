package com.hexaware.cc.presentation;

import java.util.Scanner;
import java.sql.Date;
import com.hexaware.cc.entity.*;
import com.hexaware.cc.service.*;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICustomer customerService = new CustomerServiceImp();
    private static final IVehicle vehicleService = new VehicleServiceImp();
    private static final IReservation reservationService = new ReservationServiceImp();
    private static final IAdmin adminService = new AdminServiceImp();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1 -> customerOperations();
                case 2 -> vehicleOperations();
                case 3 -> reservationOperations();
                case 4 -> adminOperations();
                case 0 -> {
                    exit = true;
                    System.out.println("Thank you for using the Car connect. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\n--- Car Connect ---");
        System.out.println("1. Customer Operations");
        System.out.println("2. Vehicle Operations");
        System.out.println("3. Reservation Operations");
        System.out.println("4. Admin Operations");
        System.out.println("0. Exit");
    }

    private static void customerOperations() {
        boolean back = false;
        while (!back) {
            displayCustomerMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1 -> getCustomerById();
                case 2 -> getCustomerByUsername();
                case 3 -> registerCustomer();
                case 4 -> updateCustomer();
                case 5 -> deleteCustomer();
                case 0 -> back = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayCustomerMenu() {
        System.out.println("\n--- Customer Operations ---");
        System.out.println("1. Get Customer by ID");
        System.out.println("2. Get Customer by Username");
        System.out.println("3. Register New Customer");
        System.out.println("4. Update Customer");
        System.out.println("5. Delete Customer");
        System.out.println("0. Back to Main Menu");
    }

    private static void getCustomerById() {
        int customerId = getIntInput("Enter Customer ID: ");
        Customer customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void getCustomerByUsername() {
        String username = getStringInput("Enter Username: ");
        Customer customerByUsername = customerService.getCustomerByUsername(username);
        if (customerByUsername != null) {
            System.out.println(customerByUsername);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private static void registerCustomer() {
        Customer newCustomer = readCustomerData();
        try {
            customerService.registerCustomer(newCustomer);
            System.out.println("Customer registered successfully.");
        } catch (Exception e) {
            System.out.println("Failed to register customer: " + e.getMessage());
        }
    }

    private static void updateCustomer() {
        Customer updatedCustomer = readCustomerData();
        try {
            customerService.updateCustomer(updatedCustomer);
            System.out.println("Customer updated successfully.");
        } catch (Exception e) {
            System.out.println("Failed to update customer: " + e.getMessage());
        }
    }

    private static void deleteCustomer() {
        int customerIdToDelete = getIntInput("Enter Customer ID to delete: ");
        try {
            customerService.deleteCustomer(customerIdToDelete);
            System.out.println("Customer deleted successfully.");
        } catch (Exception e) {
            System.out.println("Failed to delete customer: " + e.getMessage());
        }
    }

    private static void vehicleOperations() {
        System.out.println("Vehicle operations not implemented yet.");
        // TODO: Implement vehicle operations
    }

    private static void reservationOperations() {
        System.out.println("Reservation operations not implemented yet.");
        // TODO: Implement reservation operations
    }

    private static void adminOperations() {
        System.out.println("Admin operations not implemented yet.");
        // TODO: Implement admin operations
    }

    private static Customer readCustomerData() {
        Customer customer = new Customer();
        customer.setCustomerID(getIntInput("Enter Customer ID: "));
        customer.setFirstName(getStringInput("Enter First Name: "));
        customer.setLastName(getStringInput("Enter Last Name: "));
        customer.setEmail(getStringInput("Enter Email: "));
        customer.setPhoneNumber(getStringInput("Enter Phone Number: "));
        customer.setAddress(getStringInput("Enter Address: "));
        customer.setUsername(getStringInput("Enter Username: "));
        customer.setPassword(getStringInput("Enter Password: "));
        customer.setRegistrationDate(new Date(0)); 
        return customer;
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid number. Please try again.");
            scanner.next(); 
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}