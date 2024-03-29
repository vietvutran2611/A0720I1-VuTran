package com.codegym.inputvalidate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Size(min = 5,max = 45,message = "ít nhất 5 kí tự và nhiều nhất là 45 kí tự")
    private String firstName;

    @NotEmpty
    @Size(min = 5,max = 45,message = "ít nhất 5 kí tự và nhiều nhất là 45 kí tự")
    private String lastName;

    @Pattern(regexp = "\\d{2}+\\d{2}+\\d{6}",message = "Nhập đúng số điện thoại")
    private String phoneNumber;

    @Min(value = 18,message = "Dành cho người lớn hơn 18 tuổi")
    private int age;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email không đúng định dạng abc@xyz.com")
    private String email;

    public User() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
