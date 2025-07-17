package contactmanager;

import java.util.List;

public interface ContactManagerServices {

    boolean addContact(String name, String phone, String email);

    List<Contact> viewAllContacts();

    Contact searchContactByName(String name);
}
