package com.lozumi.NAMS;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户子系统类，用于管理学生、教师、主办方和团队信息。
 */
public class UserSubSystem {
    List<Student> students = new ArrayList<Student>();
    List<Organizer> organizers = new ArrayList<Organizer>();
    List<Teacher> teachers = new ArrayList<Teacher>();
    List<Team> teams = new ArrayList<Team>();

    /**
     * 构造函数，用于初始化用户子系统。
     */
    public UserSubSystem() {};

    /**
     * 向学生列表中添加学生。
     *
     * @param student 要添加的学生对象。
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * 根据学生ID从学生列表中移除学生。
     *
     * @param id 要删除的学生的ID。
     */
    public void removeStudentById(String id) {
        // 根据学生ID删除学生的逻辑
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

    /**
     * 根据学生ID查找并返回学生对象。
     *
     * @param id 要查找的学生的ID。
     * @return 学生对象，如果找不到则返回null。
     */
    public Student getStudentById(String id) {
        // 根据学生ID查找学生并返回的逻辑
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; // 如果找不到学生，则返回null
    }

    /**
     * 获取所有学生的列表。
     *
     * @return 包含所有学生的列表。
     */
    public List<Student> getStudentList() {
        return students;
    }

    /**
     * 向主办方列表中添加主办方。
     *
     * @param organizer 要添加的主办方对象。
     */
    public void addOrganizer(Organizer organizer) {
        organizers.add(organizer);
    }

    /**
     * 根据组织者ID从主办方列表中移除主办方。
     *
     * @param id 要删除的主办方的ID。
     */
    public void removeOrganizerById(String id) {
        // 根据组织者ID删除主办方的逻辑
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

    /**
     * 根据组织者ID查找并返回主办方对象。
     *
     * @param id 要查找的组织者的ID。
     * @return 主办方对象，如果找不到则返回null。
     */
    public Organizer getOrganizerById(String id){
        // 根据组织者ID查找主办方并返回的逻辑
        for (Organizer organizer: organizers) {
            if (organizer.getId().equals(id)) {
                return organizer;
            }
        }
        return null; // 如果找不到组织者，则返回null
    }

    /**
     * 获取所有主办方的列表。
     *
     * @return 包含所有主办方的列表。
     */
    public List<Organizer> getOrganizerList() {
        return organizers;
    }

    /**
     * 向教师列表中添加教师。
     *
     * @param teacher 要添加的教师对象。
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * 根据教师ID从教师列表中移除教师。
     *
     * @param id 要删除的教师的ID。
     */
    public void removeTeacherById(String id) {
        // 根据教师ID删除教师的逻辑
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

    /**
     * 根据教师ID查找并返回教师对象。
     *
     * @param id 要查找的教师的ID。
     * @return 教师对象，如果找不到则返回null。
     */
    public Teacher getTeacherById(String id) {
        // 根据教师ID查找教师并返回的逻辑
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                return teacher;
            }
        }
        return null; // 如果找不到教师，则返回null
    }

    /**
     * 获取所有教师的列表。
     *
     * @return 包含所有教师的列表。
     */
    public List<Teacher> getTeacherList() {
        return teachers;
    }

    /**
     * 创建一个团队并将其添加到团队列表中。
     *
     * @param creatorId  创建者的ID。
     * @param teamId     团队的ID。
     * @param teamName   团队的名称。
     * @param department 团队的部门。
     */
    public void createTeam(String creatorId, String teamId, String teamName, String department) {
        Student creator = getStudentById(creatorId);

        if (creator != null) {
            // 直接创建并添加 Team 对象到 teams 列表
            Team newTeam = new Team(teamId, teamName, department, creator);
            teams.add(newTeam);
            creator.teamList.add(newTeam);
        }
    }

    /**
     * 根据学生ID、团队ID和创建者ID将学生添加到指定团队。
     *
     * @param creatorId 创建者的ID。
     * @param studentId 要添加的学生的ID。
     * @param teamId 目标团队的ID。
     */
    public void addStudentToTeam(String creatorId, String studentId, String teamId) {
        // 根据学生ID、团队ID和创建者ID将学生添加到团队的逻辑
        Student student = getStudentById(studentId);
        Team team = getTeamById(teamId);
        Student creator = getStudentById(creatorId);

        if (student != null && team != null && creator != null && creator.getTeamList().contains(team)) {
            team.addStudent(student);
        }
    }

    /**
     * 根据教师ID、团队ID和创建者ID将教师添加到指定团队。
     *
     * @param creatorId 创建者的ID。
     * @param teacherId 要添加的教师的ID。
     * @param teamId 目标团队的ID。
     */
    public void addTeacherToTeam(String creatorId, String teacherId, String teamId) {
        // 根据教师ID、团队ID和创建者ID将教师添加到团队的逻辑
        Teacher teacher = getTeacherById(teacherId);
        Team team = getTeamById(teamId);
        Student creator = getStudentById(creatorId);

        if (teacher != null && team != null && creator != null && creator.getTeamList().contains(team)) {
            team.addTeacher(teacher);
        }
    }

    /**
     * 根据团队ID查找并返回团队对象。
     *
     * @param id 要查找的团队的ID。
     * @return 团队对象，如果找不到则返回null。
     */
    public Team getTeamById(String id) {
        // 根据团队ID查找团队并返回的逻辑
        for (Team team : teams) {
            if (team.getTeamId().equals(id)) {
                return team;
            }
        }
        return null; // 如果找不到团队，则返回null
    }
}

