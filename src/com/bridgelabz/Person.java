package com.bridgelabz;

public class Person {
    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public    String city;
    public   int zip;
    public   int phoneNo;

    // constructor to data

    public void contact(String firstName, String lastName, String address, String state, String city, int zip, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }

    public  void display() {
        System.out.println(" first name :"+firstName);
        System.out.println("last name :"+lastName);
        System.out.println("address is :"+address);
        System.out.println("state is: :"+state);
        System.out.println("city :"+city);
        System.out.println("zip :"+zip);
        System.out.println("phone no :"+phoneNo);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
