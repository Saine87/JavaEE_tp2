package com.polito.beans;

public class Client {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int    telephone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone( int telephone ) {
        this.telephone = telephone;
    }

}
