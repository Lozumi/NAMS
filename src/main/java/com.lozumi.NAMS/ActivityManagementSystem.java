package com.lozumi.NAMS;
import java.util.List;

/**
 * ActivityManagementSystem 类负责显示校园活动管理系统的用户和活动信息。
 */
public class ActivityManagementSystem {
    UserSubSystem usSystem = new UserSubSystem();
    ActivitySubSystem asSystem = new ActivitySubSystem();

    /**
     * 显示系统中用户（学生、教师、主办方）的信息。
     */
    public void displayUserSubSystem() {
        // 获取用户信息并显示
        List<Student> students = usSystem.getStudentList();
        List<Teacher> teachers = usSystem.getTeacherList();
        List<Organizer> organizers = usSystem.getOrganizerList();

        // 显示学生信息
        System.out.println("学生信息：");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // 显示教师信息
        System.out.println("教师信息：");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }

        // 显示主办方信息
        System.out.println("主办方信息：");
        for (Organizer organizer : organizers) {
            System.out.println(organizer.toString());
        }
    }

    /**
     * 显示系统中活动的信息。
     */
    public void displayActivitySubSystem() {
        List<Activity> activities = asSystem.getActivityList();
        for (Activity activity : activities) {
            System.out.println(activity.toString());
        }
    }

    /**
     * 获取 UserSubSystem 实例。
     *
     * @return UserSubSystem 实例。
     */
    public UserSubSystem getUserSubSystem() {
        return usSystem;
    }

    /**
     * 获取 ActivitySubSystem 实例。
     *
     * @return ActivitySubSystem 实例。
     */
    public ActivitySubSystem getActivitySubSystem() {
        return asSystem;
    }
}
