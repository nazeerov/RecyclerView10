package com.nazirov.recyclerview10.model;

public class Member {
    private String firstName;
    private String lastName;


    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;

    }
    public Member() {

    }


    public String getFirstName (){return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName; }

    public void setLastName(String lastName) {this.lastName = lastName; }

    public String getLastName (){return lastName;}
}

