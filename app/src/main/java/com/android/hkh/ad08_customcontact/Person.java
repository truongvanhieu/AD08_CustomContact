package com.android.hkh.ad08_customcontact;

/**
 * Created by hieu.truongvan on 5/20/2017.
 */

public class Person {
    private String name;
    private String phone;

    public Person() {
        this.name = "";
        this.phone = "";
    }
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
