package collection.map.phonebook;


import java.util.*;

public class PhoneBook {

    private TreeMap<String, String> contacts = new TreeMap<>();

    // Add a new contact
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    // Remove a contact
    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found in contacts.");
        }
    }

    // Search contact by name
    public void searchContact(String name) {
        String number = contacts.get(name);
        if (number != null) {
            System.out.println(name + " -> " + number);
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Show all contacts (sorted automatically by TreeMap)
    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            contacts.forEach((name, number) ->
                    System.out.println(name + " -> " + number));
        }
    }
}
