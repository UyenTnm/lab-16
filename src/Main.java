import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contactList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    showAllContacts();
                    break;
                case "2":
                    searchContactByNumber();
                    break;
                case "3":
                    addContact();
                    break;
                case "4":
                    editContact();
                    break;
                case "5":
                    deleteContact();
                    break;
                default:
                    System.out.println("Thank you for choosing our servies");
                    return;
            }
        }
    }

    public static void showMenu() {
        System.out.println("Management Contact");
        System.out.println("1. List Contact");
        System.out.println("2. Search Contact by Phone Number");
        System.out.println("3. Add Contact");
        System.out.println("4. Edit Contact");
        System.out.println("5. Delete Contact");
        System.out.println("To exit the program, please select another number : ");
    }

    public static void showAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (Contact a : contactList) {
            a.display();
        }
    }

    public static void searchContactByNumber() {
        System.out.print("Please enter the phone number you are looking for: ");
        String phone = scanner.nextLine();
        // int phone = Integer.parseInt(scanner.nextLine());
        for (Contact a : contactList) {
            if (phone.equals(a.getPhone())) {
                a.display();
                return;
            }
        }
        System.out.println("Not Found");
    }

    private static int idCounter = 1;

    public static void addContact() {
        // System.out.print("ID : ");
        // int id = Integer.parseInt(scanner.nextLine());
        int id = idCounter++;
        // for (Contact a : contactList) {
        // if (a.getId() == id) {
        // System.out.println("ID already exists");
        // return;
        // }
        // }
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        contactList.add(new Contact(id, name, phone, email, address));
        System.out.println("Added Successfully (Id = " + id + ") ");

    }

    public static void editContact() {
        System.out.print("Enter the ID edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Contact a : contactList) {
            if (a.getId() == id) {
                System.out.print("Name: ");
                a.setName(scanner.nextLine());
                System.out.print("Phone number: ");
                a.setPhone(scanner.nextLine());
                System.out.print("Email: ");
                a.setEmail(scanner.nextLine());
                System.out.print("Address: ");
                a.setAddresss(scanner.nextLine());
                System.out.println("Edited Successfully: ");
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void deleteContact() {
        System.out.print("Enter the ID delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Contact a : contactList) {
            if (a.getId() == id) {
                contactList.remove(a);
                System.out.println("Deleted to Successfully ");
                return;
            }
        }
        System.out.println("Not Found");
    }
}
