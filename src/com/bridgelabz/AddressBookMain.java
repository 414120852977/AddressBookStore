package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Store System");

        Person person = new Person();
        person.contact("joe","bidden","hdh","dhgd","gdhghs",45454,46466);
        person.display();

        List<Person> list = new ArrayList<>();
        list.add(person);

        System.out.println(list);

        PersonManager personManager = new PersonManager();
        personManager.addPerson();
        System.out.println(list);
        personManager.editPerson();
        System.out.println(list);
        personManager.deletePerson();

        // objects for addressbook
        AddressBook addressBook = new AddressBook();
        addressBook.AddBook();
        System.out.println("thanks for joining us");
    }
}
