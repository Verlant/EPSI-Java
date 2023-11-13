import java.util.Map;
import java.util.Scanner;

public class ContactList {

    private Map<String,String> contacts;

    public ContactList(Map<String,String> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Scanner scanner) {
        System.out.print("Saisissez le nom du nouveau contact : ");
        String name = scanner.nextLine();
        System.out.print("Saisissez le numéro du contact : ");
        String number = scanner.nextLine();
        this.getContacts().put(name, number);
    }

    public void editContact(Scanner scanner) {
        System.out.print("Saisissez le nom du contact à modifier : ");
        String name = scanner.nextLine();
        if (!this.contacts.containsKey(name)) {
            System.out.println("Ce contact n'existe pas dans votre répertoire.");
            return;
        }
        System.out.print("Saisissez le numéro du contact : ");
        String number = scanner.nextLine();
        this.getContacts().put(name, number);
    }

    public void deleteContact(Scanner scanner) {
        System.out.print("Saisissez le nom du contact à supprimer : ");
        String name = scanner.nextLine();
        if (!this.contacts.containsKey(name)) {
            System.out.println("Ce contact n'existe pas dans votre répertoire.");
            return;
        }
        this.getContacts().remove(name);
    }

    public void printContactList() {
        System.out.println(this.getContacts());
    }

    public Map<String, String> getContacts() {
        return contacts;
    }
}
