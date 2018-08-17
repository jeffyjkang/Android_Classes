package com.lambdaschool.android_classes;

public class Contact {

    private String name, phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisplay() {
        return String.format("%s - %s", this.name, this.phone);
    }
}
