package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public void AddBook() {
        System.out.println("hii user where you want to store your details");
        System.out.println("0/exit,1/Aurangabad,2/jalna,3/beed,4/pune");

        System.out.println("enter a number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Person>  list = new ArrayList<>();

        switch(number) {
            case 1:
                Person person = new Person();
                System.out.println("First Name: ");
                String firstName = scanner.next();
                person.setFirstName(firstName);

                System.out.println("Last Name: ");
                String lastName = scanner.next();
                person.setLastName(lastName);

                System.out.println("City: ");
                String city = scanner.next();
                person.setCity(city);

                System.out.println("State: ");
                String state = scanner.next();
                person.setState(state);

                System.out.println("Zip: ");
                int zip = scanner.nextInt();
                person.setZip(zip);

                System.out.println("PhoneNumber: ");
                int phoneNo = scanner.nextInt();
                person.setPhoneNo(phoneNo);
                list.add(person);

                AddBook();
            break;
            case 2:
               Person person1 = new Person();
                System.out.println("First Name: ");
                String firstName1 = scanner.next();
                person1.setFirstName(firstName1);

                System.out.println("Last Name: ");
                String lastName1 = scanner.next();
                person1.setLastName(lastName1);

                System.out.println("City: ");
                String city1 = scanner.next();
                person1.setCity(city1);

                System.out.println("State: ");
                String state1 = scanner.next();
                person1.setState(state1);

                System.out.println("Zip: ");
                int zip1 = scanner.nextInt();
                person1.setZip(zip1);

                System.out.println("PhoneNumber: ");
                int phoneNo1 = scanner.nextInt();
               list.add(person1);

                AddBook();
        }

        System.out.println(list);
    }
}
