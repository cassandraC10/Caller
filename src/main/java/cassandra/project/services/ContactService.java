package cassandra.project.services;

import cassandra.project.data.models.Contact;

import java.util.List;

public interface ContactService {
    void addContact(String firstName, String lastName, String phoneNumber);

    Contact findById(String id);

    void addContact(String firstName, String phoneNumber);


    Contact update (Contact contact);

    Contact findByPhoneNumber(String phoneNumber);


    void delete(Contact contact);


    List<Contact> findName(String name);
}
