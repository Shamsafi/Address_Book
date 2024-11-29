import java.util.Scanner;
public class AddressBookMain{
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

       AddressBookManager manager = new AddressBookManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nMain Menu:");
            System.out.println("1: Create an Address Book");
            System.out.println("2. Manage Existing Address Book");
            System.out.println("3. List all Address Book");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 :
                    manager.addAddressBook();
                    break;
                case 2 :
                    manager.manageAddressBook();
                    break;
                case 3:
                    manager.ListAddressBook();
                    break;
                case 4 :
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("Invalid choice!!!!!!");
            }
        }while (choice != 4);
    }
}
