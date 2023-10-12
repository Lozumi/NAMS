package com.lozumi.NAMS;

import java.util.ArrayList;
import java.util.List;

public class UserSubSystem {
    List<Student> students = new ArrayList<Student>();
    List<Organizer> organizers = new ArrayList<Organizer>();
    List<Teacher> teachers = new ArrayList<Teacher>();
    List<Team> teams = new ArrayList<Team>();

    public UserSubSystem() {};

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentById(String id) {
        // 根据学生ID删除学生
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
        }
    }

    public Student getStudentById(String id) {
        // 根据学生ID查找学生并返回
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; // 如果找不到学生，则返回null
    }

    public List<Student> getStudentList() {
        return students;
    }

    public void addOrganizer(Organizer organizer) {
        organizers.add(organizer);
    }

    public void removeOrganizerById(String id) {
        // 根据组织者ID删除组织者
        Organizer organizerToRemove = null;
        for (Organizer organizer : organizers) {
            if (organizer.getId().equals(id)) {
                organizerToRemove = organizer;
                break;
            }
        }
        if (organizerToRemove != null) {
            organizers.remove(organizerToRemove);
        }
    }

    public Organizer getOrganizerById(String id){
        // 根据组织者ID查找教师并返回
        for (Organizer organizer: organizers) {
            if (organizer.getId().equals(id)) {
                return organizer;
            }
        }
        return null; // 如果找不到组织者，则返回null
    }

    public List<Organizer> getOrganizerList() {
        return organizers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacherById(String id) {
        // 根据教师ID删除教师
        Teacher teacherToRemove = null;
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                teacherToRemove = teacher;
                break;
            }
        }
        if (teacherToRemove != null) {
            teachers.remove(teacherToRemove);
        }
    }

    public Teacher getTeacherById(String id) {
        // 根据教师ID查找教师并返回
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                return teacher;
            }
        }
        return null; // 如果找不到教师，则返回null
    }

    public List<Teacher> getTeacherList() {
        return teachers;
    }

    public void createTeam(String creatorId, String teamId, String teamName, String department) {
        Student creator = getStudentById(creatorId);

        if (creator != null) {
            // 直接创建并添加 Team 对象到 teams 列表
            Team newTeam = new Team(teamId, teamName, department, creator);
            teams.add(newTeam);
            creator.teamList.add(newTeam);
        }
    }

    public void addStudentToTeam(String creatorId, String studentId, String teamId) {
        // 根据学生ID、团队ID和创建者ID将学生添加到团队的逻辑
        Student student = getStudentById(studentId);
        Team team = getTeamById(teamId);
        Student creator = getStudentById(creatorId);

        if (student != null && team != null && creator != null && creator.getTeamList().contains(team)) {
            team.addStudent(student);

        }
    }

    public void addTeacherToTeam(String creatorId, String teacherId, String teamId) {
        // 根据教师ID、团队ID和创建者ID将教师添加到团队的逻辑
        Teacher teacher = getTeacherById(teacherId);
        Team team = getTeamById(teamId);
        Student creator = getStudentById(creatorId);

        if (teacher != null && team != null && creator != null && creator.getTeamList().contains(team)) {
            team.addTeacher(teacher);
        }
    }

    public Team getTeamById(String id) {
        // 根据团队ID查找团队并返回
        for (Team team : teams) {
            if (team.getTeamId().equals(id)) {
                return team;
            }
        }
        return null; // 如果找不到团队，则返回null
    }
}
