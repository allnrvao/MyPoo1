package models;

public class Student {
    private String name;
    private String registrationNumber;
    private double average;

    public Student(String name, String registrationNumber, double average) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public boolean hasPassed() {
        return average >= 70;
    }

    public String showStudentData() {
        return "Name: " + name +
                ", Registration Number: " + registrationNumber +
                ", Average: " + average +
                ", Status: " + (hasPassed() ? "Passed" : "Failed");
    }
}
