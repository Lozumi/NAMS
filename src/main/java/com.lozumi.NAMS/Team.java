package com.lozumi.NAMS;
import java.util.List;

public class Team {
    String teamId;
    String teamName;
    String department;
    Student creator;
    List<Student> studentList;
    List<Teacher> teacherList;

    public Team(String teamId, String teamName, String department, Student creator) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.creator = creator;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDepartment() {
        return department;
    }

    public Student getCreator() {
        return creator;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
        student.teamList.add(this);
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Team")
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
