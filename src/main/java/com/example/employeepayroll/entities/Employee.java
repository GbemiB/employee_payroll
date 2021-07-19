package com.example.employeepayroll.entities;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Employee {
   private Long idNumber;
   private String employerNumber;
   private String role;
   private String email;
   private String password;
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   @Column(updatable = false)
   LocalDateTime createdTime;
   LocalDateTime updatedTime;

   @PrePersist
   void prePersist(){
      this.createdTime = LocalDateTime.now();
      this.updatedTime = LocalDateTime.now();
   }

   @PreUpdate
   void preUpdate(){
      this.updatedTime = LocalDateTime.now();
   }

   public void setIdNumber(Long idNumber) {
      this.idNumber = idNumber;
   }

   public void setEmployerNumber(String employerNumber) {
      this.employerNumber = employerNumber;
   }

   public String getRole() {
      return role;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public void setCreatedTime(LocalDateTime createdTime) {
      this.createdTime = createdTime;
   }

   public void setUpdatedTime(LocalDateTime updatedTime) {
      this.updatedTime = updatedTime;
   }

   public Long getIdNumber() {
      return idNumber;
   }

   public String getEmployerNumber() {
      return employerNumber;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public String getEmail() {
      return email;
   }

   public String getPassword() {
      return password;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getDateOfBirth() {
      return dateOfBirth;
   }

   public LocalDateTime getCreatedTime() {
      return createdTime;
   }

   public LocalDateTime getUpdatedTime() {
      return updatedTime;
   }

   Employee(){

   }

   public Employee(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public Employee(Long idNumber, String employerNumber, String role, String email, String password,
                   String firstName, String lastName, String dateOfBirth) {
      this.idNumber = idNumber;
      this.employerNumber = employerNumber;
      this.role = role;
      this.email = email;
      this.password = password;
      this.firstName = firstName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
   }

   public Employee(Long idNumber, String employerNumber, String role, String email,
                   String firstName, String lastName, String dateOfBirth) {
      this.idNumber = idNumber;
      this.employerNumber = employerNumber;
      this.role = role;
      this.email = email;
      this.firstName = firstName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      return super.equals(obj);
   }

   @Override
   public String toString() {
      return "EmployeeData{" +
              "idNumber=" + idNumber +
              ", employerNumber='" + employerNumber + '\'' +
              ", role='" + role + '\'' +
              ", email='" + email + '\'' +
              ", password='" + password + '\'' +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", dateOfBirth='" + dateOfBirth + '\'' +
              ", createdTime=" + createdTime +
              ", updatedTime=" + updatedTime +
              '}';
   }
}
