package com.lozumi.NAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
    public ArrayList<Team> getTeamList() {
        return teamList.stream().collect(Collectors.toCollection(ArrayList::new));//转换List为ArrayList
    }

    private String getTeamNameList() {
        String teamNameList = "";
        for (Team team : teamList) {
            if (Objects.equals(teamNameList, ""))
                teamNameList += team.teamName;
            else
                teamNameList += "_" + team.teamName;
        }
        return teamNameList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(studentNo)
                .append("_")
                .append(gender)
                .append("_")
                .append(grade)
                .append("_")
                .append(department)
                .append("_")
                .append(getTeamNameList())
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
