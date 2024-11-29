import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressBook extends Contact{
    private List<Contact>  contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContactDetails(){

        Contact contact = new Contact();
        System.out.print("Enter First Name:- ");
        contact.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name:- ");
        contact.setLastName(scanner.nextLine());

        System.out.print("Enter Address:- ");
        contact.setAddress(scanner.nextLine());

        System.out.print("Enter the City:- ");
        contact.setCity(scanner.nextLine());

        System.out.print("Enter the State:- ");
        contact.setState(scanner.nextLine());

        System.out.print("Enter the Zip:- ");
        contact.setZip(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Enter the Phone Number:- ");
        contact.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter the Email:- ");
        contact.setEmail(scanner.nextLine());
        contacts.add(contact);
        System.out.println("Contacts Added Sucessfully\n");
    }

    public void editContactDetails(){
        System.out.println("Enter the first name of the contact you want to edit:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name of the contact you want to edit:");
        String lastName = scanner.nextLine();
        String Name = scanner.nextLine();
        for(Contact contact : contacts){
            if(contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)){
                System.out.println("Enter New Phone Number:- ");
                contact.setPhoneNumber(scanner.nextLine());
                System.out.println("Enter New Email:- ");
                contact.setEmail(scanner.nextLine());
                System.out.println("Details updated successfully\n");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void deleteContact(){
        System.out.println("Enter the first name of the contact you want to edit:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name of the contact you want to edit:");
        String lastName = scanner.nextLine();
        String Name = scanner.nextLine();
        for(Contact contact : contacts){
            if(contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)){
                contacts.remove(contact);
                System.out.println("Contact Deleted successfully\n");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void displayContactDetails(){
        if(contacts.isEmpty()){
            System.out.println("No contact avilable.\n");
            return;
        }

        System.out.println("\nContacts:- ");
        for(Contact contact : contacts){
            System.out.println("\nContact Details are:- ");
            System.out.println("First Name:- "+ contact.getFirstName());
            System.out.println("Last Name:- "+ contact.getLastName());
            System.out.println("Address:- "+contact.getAddress());
            System.out.println("City:- "+contact.getCity());
            System.out.println("State:- "+contact.getState());
            System.out.println("Zip:- "+contact.getZip());
            System.out.println("Phone Number:- "+contact.getPhoneNumber());
            System.out.println("Email:- "+contact.getEmail());
        }
    }
}
