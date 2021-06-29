package com.addresbooksystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class AddresBookSystem {
        static Scanner sc = new Scanner(System.in);
        static List<editContact> list = new LinkedList<editContact>();

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

            editContact obj = new editContact();
            list.add(obj);
        }


        public static void editContact()
        {
            //Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name for confirmation : ");
            String firstName = sc.nextLine();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getFirstName().equalsIgnoreCase(firstName))
                {
                    list.remove(i);
                    addContact();
                    System.out.println("Successfully Edit data");
                }
                else {
                    System.out.println("No data found in Address Book");
                }
            }
        }


        public static <AddresBook> void main(String[] args) {

            AddressBook addressBook = new AddressBook();
            //Displaying the welcome message

            System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
            //Adding new contact

            System.out.println("Enter details of new contact");
            addContact();
            //Editing Contact
            editContact();

            System.out.println(list); //printing list
        }
    }
