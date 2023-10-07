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
        final StringBuilder sb = new StringBuilder("Teacher").append('[')
                .append("unit=")
                .append(unit)
                .append("_id=")
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
}
