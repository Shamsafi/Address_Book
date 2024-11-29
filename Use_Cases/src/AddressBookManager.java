import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookManager extends AddressBookMain {
    public Map<String, AddressBook> addressBooks = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addAddressBook(){
        System.out.println("Enter Address Book Name: ");
        String name = scanner.nextLine();

        if(addressBooks.containsKey(name)){
            System.out.println("An address book with this name already exists.");
        }else{
            AddressBook addressBook = new AddressBook();
            addressBooks.put(name,addressBook);
            System.out.println("Address Book Name Added Successfully");
            System.out.println(name);
        }
    }

    public void manageAddressBook(){
        System.out.println("Enter the Address Book to Manage");
        String name = scanner.nextLine();

        if(!addressBooks.containsKey(name)){
            System.out.println("Address Book Not Found");
        }else{
            AddressBook addressBook = addressBooks.get(name);
            manageContacts(addressBook);
        }
    }

    private void manageContacts(AddressBook addressBook){
        int choice;
        do {
            System.out.println("\nAddress Book Options:");
            System.out.println("1: Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contact");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addressBook.addContactDetails();
                    break;
                case 2:
                    addressBook.editContactDetails();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContactDetails();
                    break;
                case 5:
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("Invalid choice!!!!!!");
            }
        }while (choice != 5);
    }

    public void ListAddressBook(){
        if(addressBooks.isEmpty()){
            System.out.println("No Address Book Avilable.");
        }else{
            System.out.println("Address Book:- ");
            for (String name :  addressBooks.keySet()){
                System.out.println(name);
            }
        }
    }
}
