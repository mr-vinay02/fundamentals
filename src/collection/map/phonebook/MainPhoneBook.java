package collection.map.phonebook;

public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Vinay", "9876543210");
        phoneBook.addContact("Archana", "9123456780");
        phoneBook.addContact("Ullas", "9988776655");
        phoneBook.addContact("Abhi", "9001122334");

        System.out.println("📒 Phone Book:");
        phoneBook.showAllContacts();

        System.out.println("\n🔍 Searching contact:");
        phoneBook.searchContact("Archana");

        System.out.println("\n❌ Removing contact:");
        phoneBook.removeContact("Ullas");

        System.out.println("\n📒 Updated Phone Book:");
        phoneBook.showAllContacts();
    }
}
