package se.distansakademin.models;

public abstract class User {

    private final String fullName;

    public User(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
