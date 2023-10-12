package com.lozumi.NAMS;
import java.util.List;

public class Student extends User {
    String studentNo;
    boolean gender;
    String grade;
    String department;
    List<Team> teamList = new ArrayList<Team>();

    public Student(String id, String name, String phoneNo, String email, String studentNo, boolean gender, String grade, String department) {
        super(id, name, phoneNo, email);
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
        final StringBuilder sb = new StringBuilder("Student")
                .append(studentNo)
                .append("_")
                .append(gender)
                .append("_")
                .append(grade)
                .append("_")
                .append(department)
                .append("_")
                .append(teamList);
        return sb.toString();
    }
}
