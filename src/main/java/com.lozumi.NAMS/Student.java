package com.lozumi.NAMS;
import java.util.List;

public class Student {
    String studentNo;
    boolean gender;
    String grade;
    String department;
    List<Team> teamList;

    public Student(String studentNo, boolean gender, String grade, String department) {
        this.studentNo = studentNo;
        this.gender = gender;
        this.grade = grade;
        this.department = department;
    }

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
    //获取学生创建的团队列表
    public List<Team> getTeamList(){
        return teamList;
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
