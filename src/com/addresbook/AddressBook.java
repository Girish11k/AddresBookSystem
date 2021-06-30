package com.addresbook;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

    public class AddressBook {
        static Scanner sc = new Scanner(System.in);
        static List<Contact> list = new LinkedList<Contact>();

        //Created method for adding contact
        public static void addContact()
        {
            System.out.println("Enter your firstName : ");
            String firstName = sc.nextLine();
            System.out.println("Enter your lastName : ");
            String lastName = sc.nextLine();
            System.out.println("Enter your address : ");
            String address = sc.nextLine();
            System.out.println("Enter your city : ");
            String city = sc.nextLine();
            System.out.println("Enter your state : ");
            String state = sc.nextLine();
            System.out.println("Enter your pin : ");
            String pin = sc.nextLine();
            System.out.println("Enter your MobileNo : ");
            String MobileNo = sc.nextLine();
            System.out.println("Enter your email : ");
            String email = sc.nextLine();
            Contact obj = new Contact(firstName, lastName, city, state, pin, MobileNo, email);
            list.add(obj);
        }


        public static void main(String[] args) {

            AddressBook addressBook = new AddressBook();
            //Displaying the welcome message
            System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
            //Adding new contact
            System.out.println("Enter details of new contact");
            addContact();

            //Creating contact and adding new contact details to the list
            System.out.println("You want to add contact M/N");
            String chose = sc.nextLine();
            if(chose.equalsIgnoreCase("y"))
                addContact();
            else
                System.out.println(list); //printing list
        }
    }
