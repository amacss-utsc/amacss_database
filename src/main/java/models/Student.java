package models;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Student {
  @Id
  public int studentNumber;
  
  public String name;
  public String email;
  public int membershipType;
  public Date expirationDate;
  public String paymentType;
  
  //Constructors
  public Student() {}
  
  public Student(int studentNumber, String name, String email, 
                                    int membershipType, Date expirationDate, String paymentType) {
    this.studentNumber = studentNumber;
    this.name = name;
    this.email = email;
    this.membershipType = membershipType;
    this.expirationDate = expirationDate;
    this.paymentType = paymentType;
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getMembershipType() {
    return membershipType;
  }

  public void setMembershipType(int membershipType) {
    this.membershipType = membershipType;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }
}   
