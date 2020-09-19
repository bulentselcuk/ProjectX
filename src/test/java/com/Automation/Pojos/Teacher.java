package com.Automation.Pojos;

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
