package com.lozumi.NAMS;

import java.util.Objects;

public class User {
    String id;
    String name;
    String phoneNo;
    String email;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User").append('[')
                .append("id=")
                .append(id)
                .append("_name=")
                .append(name)
                .append("_phoneNo=")
                .append(phoneNo)
                .append("_email=")
                .append(email)
                .append(']');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
