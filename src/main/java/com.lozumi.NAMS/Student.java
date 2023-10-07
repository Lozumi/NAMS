package com.lozumi.NAMS;
import java.util.List;

public class Student {
    String studentNo;
    boolean gender;
    String grade;
    String department;

    public String getStudentNo() {
        return studentNo;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }
    public List<Team> getTeamList(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student").append('[')
                .append("studentNo=")
                .append(studentNo)
                .append("_gender=")
                .append(gender)
                .append("_grade=")
                .append(grade)
                .append("_department=")
                .append(department)
                .append(']');
        return sb.toString();
    }
}
