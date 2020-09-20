package com.Automation.Pojos;

import com.google.gson.annotations.SerializedName;

/**
 *  {
 *                 "firstName": "NewName",
 *                 "lastName": "OldName",
 *                 "emailAddress": "New@gmail.com",
 *                 "joinDate": "01/02/2020",
 *                 "password": "233-333-3333",
 *                 "phone": "293934922",
 *                 "subject": "swimming",
 *                 "gender": "Male",
 *                 "department": "something",
 *                 "birthDate": "01/29/1988",
 *                 "salary": 3000,
 *                 "batch": 18,
 *                 "section": "whatever",
 *                 "premanentAddress": "123 maint st",
 *                 "_links": {
 *                     "self": {
 *                         "href": "http://api.cybertektraining.com/teachers/8982"
 *                     },
 *                     "teacher": {
 *                         "href": "http://api.cybertektraining.com/teachers/8982"
 *                     }
 *                 }
 *             },
 */
public class Teacher {

    private int teacherId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String joinDate;
    private String password;
    private String phone;
    private String subject;
    private String gender;
    private String department;
    private String birthDate;
    private int salary;
    private int batch;
    private String section;
    private String premanentAddress;
    @SerializedName ( "_links" )
    private Object links;
    public int getTeacherId() {
        return teacherId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress=emailAddress;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate=joinDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject=subject;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department=department;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate=birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch=batch;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section=section;
    }

    public String getPremanentAddress() {
        return premanentAddress;
    }

    public void setPremanentAddress(String premanentAddress) {
        this.premanentAddress=premanentAddress;

    }

    @Override
    public String toString() {
        return "teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", subject='" + subject + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", salary=" + salary +
                ", batch=" + batch +
                ", section='" + section + '\'' +
                ", premanentAddress='" + premanentAddress + '\'' +
                '}';
    }
}
