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

    public Profile(Builder builder) {
        this.ID = builder.ID;
        this.account = builder.account;
        this.weight = builder.weight;
        this.desiredWeight = builder.desiredWeight;
        this.length = builder.length;
        this.dateOfBirth = builder.dateOfBirth;
        this.bmi = builder.bmi;
        this.favouriteSnack = builder.favouriteSnack;
        this.unit = builder.unit;
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

    public static class Builder{
        private int ID;
        private Account account;
        private double weight;
        private double desiredWeight;
        private double length;
        private Date dateOfBirth;
        private double bmi;
        private Snack favouriteSnack;
        private UnitsDistance unit;

        public Builder setID(int ID) {
            this.ID = ID;
            return this;
        }

        public Builder setAccount(Account account) {
            this.account = account;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setDesiredWeight(double desiredWeight) {
            this.desiredWeight = desiredWeight;
            return this;
        }

        public Builder setLength(double length) {
            this.length = length;
            return this;
        }

        public Builder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setBmi(double bmi) {
            this.bmi = bmi;
            return this;
        }

        public Builder setFavouriteSnack(Snack favouriteSnack) {
            this.favouriteSnack = favouriteSnack;
            return this;
        }

        public Builder setUnit(UnitsDistance unit) {
            this.unit = unit;
            return this;
        }

        public Profile build(){
            return new Profile(this);
        }
    }
}
