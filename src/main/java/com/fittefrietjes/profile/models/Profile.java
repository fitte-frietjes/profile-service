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

    public Account getAccount() {
        return account;
    }

    public double getWeight() {
        return weight;
    }

    public double getDesiredWeight() {
        return desiredWeight;
    }

    public double getLength() {
        return length;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getBmi() {
        return bmi;
    }

    public Snack getFavouriteSnack() {
        return favouriteSnack;
    }

    public UnitsDistance getUnit() {
        return unit;
    }

    public Profile setID(int ID) {
        this.ID = ID;
        return this;
    }

    public Profile setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Profile setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Profile setDesiredWeight(double desiredWeight) {
        this.desiredWeight = desiredWeight;
        return this;
    }

    public Profile setLength(double length) {
        this.length = length;
        return this;
    }

    public Profile setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Profile setBmi(double bmi) {
        this.bmi = bmi;
        return this;
    }

    public Profile setFavouriteSnack(Snack favouriteSnack) {
        this.favouriteSnack = favouriteSnack;
        return this;
    }

    public Profile setUnit(UnitsDistance unit) {
        this.unit = unit;
        return this;
    }
}
