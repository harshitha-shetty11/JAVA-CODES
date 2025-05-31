import java.util.*;

public class PhoneBook {
    private HashMap<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added successfully!");
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phonebook is empty.");
        } else {
            System.out.println("Contacts:");
            for (String name : contacts.keySet()) {
                System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    phoneBook.searchContact(searchName);
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 4:
                    phoneBook.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting Phonebook. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
