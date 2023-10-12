package com.lozumi.NAMS;

import java.util.*;

/**
 * 活动类，用于表示系统中的活动信息。
 */
public class Activity {
    String id;
    String name;
    Date startTime;
    Date endTime;
    String description;
    String site;
    // 创建列表
    List<Team> teams = new ArrayList<Team>();
    List<Teacher> teachers = new ArrayList<Teacher>();
    List<Organizer> organizers = new ArrayList<Organizer>();

    // 默认构造函数
    public Activity() {
    }

    /**
     * 创建一个活动对象，提供活动的基本信息。
     *
     * @param id          活动的唯一标识ID。
     * @param name        活动的名称。
     * @param startTime   活动的开始时间。
     * @param endTime     活动的结束时间。
     * @param description 活动的描述信息。
     * @param site        活动的地点。
     */
    public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.site = site;
    }

    /**
     * 获取活动的唯一标识ID。
     *
     * @return 活动ID。
     */
    public String getId() {
        return this.id;
    }

    /**
     * 获取活动的名称。
     *
     * @return 活动名称。
     */
    public String getName() {
        return this.name;
    }

    /**
     * 获取活动的开始时间。
     *
     * @return 活动开始时间。
     */
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * 获取活动的结束时间。
     *
     * @return 活动结束时间。
     */
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * 获取活动的描述信息。
     *
     * @return 活动描述信息。
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 获取活动的地点。
     *
     * @return 活动地点。
     */
    public String getSite() {
        return this.site;
    }

    /**
     * 设置活动的描述信息。
     *
     * @param description 要设置的描述信息。
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 向活动中添加一个团队。
     *
     * @param team 要添加的团队对象。
     */
    public void addTeamToActivity(Team team) {
        teams.add(team);
    }

    /**
     * 从活动中移除一个团队。
     *
     * @param id 要移除的团队的唯一标识ID。
     */
    public void removeTeamFromActivity(String id) {
        for (Team team : teams) {
            if (team.getTeamId().equals(id)) {
                teams.remove(team);
                break;
            }
        }
    }

    /**
     * 向活动中添加一位教师。
     *
     * @param teacher 要添加的教师对象。
     */
    public void addTeacherToActivity(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * 从活动中移除一位教师。
     *
     * @param id 要移除的教师的唯一标识ID。
     */
    public void removeTeacherFromActivity(String id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                teachers.remove(teacher);
                break;
            }
        }
    }

    /**
     * 向活动中添加一个主办方。
     *
     * @param organizer 要添加的主办方对象。
     */
    public void addOrganizerToActivity(Organizer organizer) {
        organizers.add(organizer);
    }

    /**
     * 从活动中移除一个主办方。
     *
     * @param id 要移除的主办方的唯一标识ID。
     */
    public void removeOrganizerFromActivity(String id) {
        for (Organizer organizer : organizers) {
            if (organizer.getId().equals(id)) {
                organizers.remove(organizer);
                break;
            }
        }
    }

    /**
     * 获取活动团队的迭代器。
     *
     * @return 活动团队的迭代器。
     */
    public Iterator<Team> getTeamsIterator() {
        return teams.iterator();
    }

    /**
     * 获取活动教师的迭代器。
     *
     * @return 活动教师的迭代器。
     */
    public Iterator<Teacher> getTeachersIterator() {
        return teachers.iterator();
    }

    /**
     * 获取活动主办方的迭代器。
     *
     * @return 活动主办方的迭代器。
     */
    public Iterator<Organizer> getOrganizersIterator() {
        return organizers.iterator();
    }

    /**
     * 判断活动对象是否与另一个对象相等。
     *
     * @param o 要比较的对象。
     * @return 如果两个活动对象相等，则返回 true；否则返回 false。
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id);
    }

    /**
     * 获取活动对象的哈希码。
     *
     * @return 活动对象的哈希码。
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * 获取活动对象的字符串表示，包括活动ID、名称、开始时间、结束时间、描述、地点、团队、教师和主办方的信息。
     *
     * @return 代表活动的字符串。
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id)
                .append("")
                .append(name)
                .append("")
                .append(startTime)
                .append("")
                .append(endTime)
                .append("")
                .append(description)
                .append("")
                .append(site)
                .append("")
                .append(teams)
                .append("")
                .append(teachers)
                .append("")
                .append(organizers);
        return sb.toString();
    }
}