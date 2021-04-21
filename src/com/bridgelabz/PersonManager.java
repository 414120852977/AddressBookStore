package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {

    public void addPerson() {

        Scanner scanner = new Scanner(System.in);
        List<Person> list = new ArrayList<>();
        System.out.println("Enter a person you want to add :");
        int p = scanner.nextInt();
        for (int i = 1; i <= p; i++) {
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
        }
        System.out.println(list);

    }

    public void editPerson() {
        Person person = new Person();
        System.out.println("enter a name to edit person");
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        List<Person> list = new ArrayList<>();

        if (fName.equals(person.getFirstName()))
            System.out.println("1/edit first name," +
                    "2/edit lastname," +
                    "3/edit address," +
                    "4/edit city," +
                    "5/edit state," +
                    "6/edit zip," +
                    "7/edit phone no");
        System.out.println("enter a number to edit details");
        int number = scanner.nextInt();
        Person person1 = new Person();
        switch (number) {

            case 1:
                System.out.println("Re-Correct your firstName");
                person.firstName = scanner.next();
                System.out.println("new firstName: " + person.firstName);
                break;
            case 2:
                System.out.println("Re-Correct your lastname");
                person.lastName = scanner.next();
                System.out.println("new lastname: " + person.lastName);
                break;
            case 3:
                System.out.println("Re-Correct your Phone Number");
                person.phoneNo = scanner.nextInt();
                System.out.println("new PhoneNo: " + person.phoneNo);
                break;
            case 4:
                System.out.println("Re-Correct your City");
                person.city = scanner.next();
                System.out.println("new city: " + person.city);
                break;
            case 5:
                System.out.println("Re-Correct your Zip");
                person.zip = scanner.nextInt();
                System.out.println("new zip: " + person.zip);
                break;
            case 6:
                System.out.println("Re-Correct your State");
                person.state = scanner.next();
                System.out.println("new state: " + person.state);
                break;

        }
            System.out.println(list.add(person1));
    }

    public void deletePerson() {
        Person person = new Person();
        System.out.println("enter a name to edit person");
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
       List<Person> list = new ArrayList<>();

        if(fName.equals(person.getFirstName())) {
            list.remove(person);
        }
        else {
            System.out.println("not a present person such name");
        }
    }
}
