package com.pluralsight.model;

public class Speaker {

  private String firstName;
  private String lastName;

  public Speaker(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
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

  public String toString() {
    return String.format("FirsName: %s\nLastName: %s\n", this.firstName, this.lastName);
  }

}