package edu.barrinm.assign02;

public class Player {
    private String firstName = "";
    private String lastName = "";
    private int height = 0;
    private double weight = 0;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void setFirstName(String first) {
        firstName = first;
    }
    public void setLastName(String last) {
        lastName = last;
    }
    public void setHeight(int totalInches) {
        height = totalInches;
    }
    public void setWeight(double pounds) {
        weight = pounds;
    }
    public int calculateBMI() {
        int BMI;
        BMI = (int)Math.floor((703 * weight) / (Math.pow(height, 2)) + .5);
        return BMI;
    }
    public String getNameString() {
        return lastName + ", " + firstName;
    }
    public String getHeightString() {
        int Feet = height / 12;
        int Inches = height % 12;
        return Feet + "'-" + Inches + "\"";
    }
    public String getWeightString() {
        return weight + " lbs.";
    }
    public String toString() {
        return "NAME: " + getNameString() +
                "\nWEIGHT: " + getWeightString() +
                "\nHEIGHT: " + getHeightString() +
                "\nBMI: " + calculateBMI();
    }
}
