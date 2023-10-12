package com.lozumi.NAMS;

public class Organizer extends User{
    String unit;

    public Organizer(String id, String name, String phoneNo, String email, String unit) {
        super(id, name, phoneNo, email);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Organizer")
                .append(unit)
                .append("_")
                .append(id)
                .append("_")
                .append(name)
                .append("_")
                .append(phoneNo)
                .append("_")
                .append(email);
        return sb.toString();
    }
}
