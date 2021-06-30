package com.address;


public class Contact {
                    //Initialize all the parameters


        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private long phone;
        private String email;

        @Override
        public String toString()
        {
            return "Contact [firstName: "+firstName+" , "+"lastName: "+lastName+" , "+"address: "+address+" , "+"city: "+city+" , "+
                    "state: "+state+" , "+"zip: "+zip+" , "+"phoneNo: "+phone+" , "+"email: "+email+ "]" ;
        }

        //called contact class for creating contacts with given details
        public Contact(String firstName, String lastName, String address, String city, String state, String zip, long phoneNo, String email)
        {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phone = phone;
            this.email = email;
        }

        /*getting and setting the firstName, lastName, address , city , state, zip , phone number, email*/

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
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getZip() {
            return zip;
        }
        public void setZip(String zip) {
            this.zip = zip;
        }
        public long getPhoneNo() {
            return phone;
        }
        public void setPhoneNo(long phno) {
            this.phone = phno;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

    }
