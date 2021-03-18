package com.fittefrietjes.profile.models;

import com.fittefrietjes.profile.models.enums.UnitsDistance;

import java.util.Date;

public class Profile {

    private int ID;
    private Account account;
    private double weight;
    private double desiredWeight;
    private double length;
    private Date dateOfBirth;
    private double bmi;
    private Snack favouriteSnack;
    private UnitsDistance unit;

    public Profile(Account account) {
        this.account = account;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDesiredWeight() {
        return desiredWeight;
    }

    public void setDesiredWeight(double desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public Snack getFavouriteSnack() {
        return favouriteSnack;
    }

    public void setFavouriteSnack(Snack favouriteSnack) {
        this.favouriteSnack = favouriteSnack;
    }

    public UnitsDistance getUnit() {
        return unit;
    }

    public void setUnit(UnitsDistance unit) {
        this.unit = unit;
    }
}
