package com.lozumi.NAMS;

/**
 * 教师类，表示一个教师用户。
 */
public class Teacher extends User {
    String teacherNo;
    String department;

    /**
     * 构造一个教师对象。
     *
     * @param id         教师ID
     * @param name       教师姓名
     * @param phoneNo    教师电话号码
     * @param email      教师邮箱地址
     * @param teacherNo  教师工号
     * @param department 教师所在系别
     */
    public Teacher(String id, String name, String phoneNo, String email, String teacherNo, String department) {
        super(id, name, phoneNo, email);
        this.teacherNo = teacherNo;
        this.department = department;
    }

    /**
     * 获取教师的工号。
     *
     * @return 教师工号
     */
    public String getTeacherNo() {
        return teacherNo;
    }

    /**
     * 获取教师所在系别。
     *
     * @return 教师所在系别
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置教师所在系别。
     *
     * @param department 新的系别
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 重写父类的 toString 方法，返回教师的信息字符串。
     *
     * @return 包含教师工号、系别、ID、姓名、电话号码和邮箱的字符串
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(teacherNo)
                .append("_")
                .append(department)
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
