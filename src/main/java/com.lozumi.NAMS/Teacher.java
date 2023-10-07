package com.lozumi.NAMS;

public class Teacher extends User{
    String teacherNo;
    String department;

    public String getTeacherNo() {
        return teacherNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher").append('[')
                .append("teacherNo=")
                .append(teacherNo)
                .append("_department=")
                .append(department)
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
