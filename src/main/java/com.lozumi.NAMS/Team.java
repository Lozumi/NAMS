package com.lozumi.NAMS;

import java.util.ArrayList;
import java.util.List;

/**
 * 团队类，用于表示学生团队。
 */
public class Team {
    String teamId;
    String teamName;
    String department;
    Student creator;
    List<Student> studentList = new ArrayList<Student>();
    List<Teacher> teacherList = new ArrayList<Teacher>();

    /**
     * 构造一个团队对象。
     *
     * @param teamId     团队的唯一标识ID。
     * @param teamName   团队的名称。
     * @param department 制造团队的部门。
     * @param creator    创建者（学生）。
     */
    public Team(String teamId, String teamName, String department, Student creator) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.creator = creator;
    }

    /**
     * 获取团队的唯一标识ID。
     *
     * @return 团队ID。
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 获取团队的名称。
     *
     * @return 团队名称。
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 获取制造团队的部门。
     *
     * @return 部门名称。
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 获取团队的创建者（学生）。
     *
     * @return 创建者对象。
     */
    public Student getCreator() {
        return creator;
    }

    /**
     * 获取团队的学生成员列表。
     *
     * @return 学生成员列表。
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * 获取团队的教师成员列表。
     *
     * @return 教师成员列表。
     */
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    /**
     * 向团队中添加学生成员。
     *
     * @param student 要添加的学生对象。
     */
    public void addStudent(Student student) {
        studentList.add(student);
    }

    /**
     * 向团队中添加教师成员。
     *
     * @param teacher 要添加的教师对象。
     */
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    /**
     * 获取团队的字符串表示，包括团队ID、名称、部门和创建者的信息。
     *
     * @return 代表团队的字符串。
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(teamId)
                .append("_")
                .append(teamName)
                .append("_")
                .append(department)
                .append("_")
                .append(creator);
        return sb.toString();
    }
}
