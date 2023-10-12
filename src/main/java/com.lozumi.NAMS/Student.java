package com.lozumi.NAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 学生类，表示一个学生用户。
 */
public class Student extends User {
    String studentNo;
    boolean gender;
    String grade;
    String department;
    List<Team> teamList = new ArrayList<Team>();

    /**
     * 构造一个学生对象。
     *
     * @param id         学生ID
     * @param name       学生姓名
     * @param phoneNo    学生电话号码
     * @param email      学生邮箱地址
     * @param studentNo  学号
     * @param gender     学生性别
     * @param grade      学生年级
     * @param department 学生所在系别
     */
    public Student(String id, String name, String phoneNo, String email, String studentNo, boolean gender, String grade, String department) {
        super(id, name, phoneNo, email);
        this.studentNo = studentNo;
        this.gender = gender;
        this.grade = grade;
        this.department = department;
    }

    /**
     * 获取学生的学号。
     *
     * @return 学生学号
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * 检查学生的性别。
     *
     * @return 如果学生性别为男性，返回 true；否则返回 false
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * 获取学生的年级。
     *
     * @return 学生年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 获取学生所在系别。
     *
     * @return 学生所在系别
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 获取学生创建的团队列表。
     *
     * @return 包含学生创建的团队的 ArrayList
     */
    public ArrayList<Team> getTeamList() {
        return teamList.stream().collect(Collectors.toCollection(ArrayList::new));
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

    /**
     * 重写父类的 toString 方法，返回学生的信息字符串。
     *
     * @return 包含学生学号、性别、年级、系别、创建的团队列表、ID、姓名、电话号码和邮箱的字符串
     */
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
