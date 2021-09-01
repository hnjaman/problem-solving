package advanceJavaBook;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    public List<Contact> findContacts(List<Contact> contacts, FilterCriteria filterCriteria){
        List<Contact> contactList = new ArrayList<>();
        for (Contact contact: contacts) {
            if (filterCriteria.match(contact)) {
                contactList.add(contact);
            }
        }
        return contactList;
    }
}
