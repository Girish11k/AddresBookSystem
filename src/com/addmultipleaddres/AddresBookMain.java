package com.addmultipleaddres;

import java.util.ArrayList;
import java.util.Scanner;
 

    public class AddresBookMain {
        public static void main(String args[]) {
            
            ArrayList<AddressBookArray> Addresbook = new ArrayList<AddressBookArray>();
            Scanner scan = new Scanner(System.in);
            String choice = "y";
            int r = 0;
            System.out.println("Welcome to Address Book Program!");
            while(r != 3) {
                System.out.println("1.CREATE AN ADDRESS BOOK");
                System.out.println("2.ACCESS AN ADDRESS BOOK");
                System.out.println("3.EXIT THE APPLICATION");
                r = scan.nextInt();
                switch(r) {
                    case 1:
                        System.out.println("Enter the name of address book to be created");
                        String name = scan.next();
                        AddressBookArray book = new AddressBookArray();
                        book.addressBookName = name;
                        Addresbook.add(book);
                        break;
                    case 2:
                        int key = 0;
                        System.out.println("Enter the address book name to be accessed");
                        String accessBook = scan.next();
                        for (int j = 0; j < Addresbook.size(); j++) {
                            if (Addresbook.get(j).addressBookName.equalsIgnoreCase(accessBook)) {
                                int switchChoice = 0;
                                while(switchChoice != 5) {
                                    System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
                                    System.out.println("Enter choice : ");
                                    switchChoice = scan.nextInt();
                                    scan.nextLine();
                                    choice = "y";
                                    switch(switchChoice) {
                                        case 1:
                                            while(choice.equals("y")) {
                                                System.out.println("Firstname : ");
                                                String firstname = scan.nextLine();
                                                System.out.println("Lastname : ");
                                                String lastname = scan.nextLine();
                                                System.out.println("Address : ");
                                                String address = scan.nextLine();
                                                System.out.println("City : ");
                                                String city = scan.nextLine();
                                                System.out.println("State : ");
                                                String state = scan.nextLine();
                                                System.out.println("Zip : ");
                                                int zip = scan.nextInt();
                                                System.out.println("PhoneNumber : ");
                                                long phonenumber = scan.nextLong();
                                                System.out.println("Email : ");
                                                scan.nextLine();
                                                String email = scan.nextLine();
                                                System.out.println("Do you want add more contact : ");
                                                choice = scan.nextLine();

                                                Contact contact = new Contact(firstname, lastname, address, city, state, zip, phonenumber, email);
                                                Addresbook.get(j).contactList.add( contact);
                                            }
                                            break;

                                        case 2:
                                            System.out.println("Enter name of contact to edit : ");
                                            String nameToEdit = scan.nextLine();
                                            int i = 0;
                                            for (i = 0; i < Addresbook.get(j).contactList.size(); i++) {
                                                if (Addresbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(nameToEdit)) {
                                                    Addresbook.get(j).contactList.get(i).editContact();
                                                }
                                            }
                                            break;

                                        case 3:
                                            System.out.println("Enter name of contact to delete : ");
                                            String deleteCon = scan.nextLine();
                                            for (i = 0; i < Addresbook.get(j).contactList.size(); i++) {
                                                if (Addresbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(deleteCon)) {
                                                    Addresbook.get(j).contactList.get(i);
                                                }
                                            }
                                            break;

                                        case 4:
                                            System.out.println("Enter name of contact to view : ");
                                            String nameToView = scan.nextLine();
                                            for (i = 0; i < Addresbook.get(j).contactList.size(); i++) {
                                                if (Addresbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(nameToView)) {
                                                    Addresbook.get(j).contactList.get(i).printContactDetails();
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }

                            }else{
                                System.out.println("Address Book not found.");
                                System.out.println("Kindly create one Address Book to work.");
                            }
                        }
                }
            }
        }

    }
