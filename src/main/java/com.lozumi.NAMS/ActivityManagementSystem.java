package com.lozumi.NAMS;
import java.util.List;

public class ActivityManagementSystem {
    UserSubSystem usSystem = new UserSubSystem();
    ActivitySubSystem asSystem = new ActivitySubSystem();
    public void displayUserSubSystem() {

        // 获取用户信息并显示
        List<Student> students = usSystem.getStudentList();
        List<Teacher> teachers = usSystem.getTeacherList();
        List<Organizer> organizers = usSystem.getOrganizerList();

        // 显示学生信息
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // 显示教师信息
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }

        // 显示主办方信息
        System.out.println("Organizers:");
        for (Organizer organizer : organizers) {
            System.out.println(organizer.toString());
        }
    }

    public void displayActivitySubSystem(){
        List<Activity> activities = asSystem.getActivityList();
        for (Activity activity : activities){
            System.out.println(activity.toString());
        }
    }
    public UserSubSystem getUserSubSystem(){
        return usSystem;
    }
    public ActivitySubSystem getActivitySubSystem() {
        return asSystem;
    }
}
