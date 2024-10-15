

import java.util.Scanner;
import com.hexaware.cc.service.ICustomer;
import com.hexaware.cc.service.CustomerServiceImp;
import com.hexaware.cc.entity.Customer;

public class Client {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ICustomer service = new CustomerServiceImp();

        System.out.println("Enter the Customer Id:");
        int customerId = scanner.nextInt();

        Customer customer = service.getCustomerById(customerId);

        if (customer != null) {
            System.out.println("Customer found:");
            System.out.println("ID: " + customer.getCustomerID());
            System.out.println("Name: " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhoneNumber());
        } else {
            System.out.println("No customer found with ID: " + customerId);
        }

        scanner.close();
    }
}