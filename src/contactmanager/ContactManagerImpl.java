package contactmanager;

import java.util.ArrayList;
import java.util.List;

public class ContactManagerImpl implements ContactManagerServices{

    static List<Contact> contacts = new ArrayList<>();

    @Override
    public boolean addContact(String name, String phone, String email) {
        Contact contact = new Contact(name, phone, email); // Create a Contact object
        return contacts.add(contact); // Add the Contact object to the list
    }

    @Override
    public List<Contact> viewAllContacts() {
        return contacts;
    }

    @Override
    public Contact searchContactByName(String name) {

        for(int i=0; i<contacts.size(); i++){
            if(contacts.get(i).getName().equals(name)){
                return contacts.get(i);
            }
        }
        return null;
    }
}
