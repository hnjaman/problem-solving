package advanceJavaBook;

import java.util.List;

public class ContactApplication {
    public static void main(String[] args) {
        List<Contact> contacts = List.of(
                new Contact("hnj", "a@gmail,com", 27, Contact.Gender.MALE),
                new Contact("sts", "s@gmail,com", 26, Contact.Gender.FEMALE),
                new Contact("aa", "a@gmail,com", 20, Contact.Gender.MALE)
                );

        ContactService contactService = new ContactService();
        // lambda expression with return statement
        List<Contact> findAged21T030 = contactService.findContacts(contacts, new FilterCriteria() {
            @Override
            public Boolean match(Contact contact) {
                return 21 <= contact.getAge() && contact.getAge() <= 30;
            }
        });

        // without return statement
        List<Contact> findTo20 = contactService.findContacts(contacts, (Contact contact) ->  20 >= contact.getAge());

        System.out.println(findAged21T030.get(0).toString());
        System.out.println(findTo20.get(0).toString());
    }
}
