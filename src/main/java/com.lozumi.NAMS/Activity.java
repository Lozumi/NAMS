package com.lozumi.NAMS;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Iterator;

public class Activity {
    String id;
    String name;
    Date startTime;
    Date endTime;
    String description;
    String site;
    //创建列表
    List<Team> teams;
    List<Teacher> teachers;
    List<Organizer> organizers;

    // default constructor
    public Activity() {
    }

    public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.site = site;
        this.teams = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.organizers = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getDescription() {
        return this.description;
    }

    public String getSite() {
        return this.site;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addTeamToActivity(Team team) {
        teams.add(team);
    }

    public void removeTeamFromActivity(String id) {
        for (Team team : teams) {
            if (team.getTeamId().equals(id)) {
                teams.remove(team);
                break;
            }
        }
    }

    public void addTeacherToActivity(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacherFromActivity(String id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                teachers.remove(teacher);
                break;
            }
        }
    }

    public void addOrganizerToActivity(Organizer organizer) {
        organizers.add(organizer);
    }

    public void removeOrganizerFromActivity(String id) {
        for (Organizer organizer : organizers) {
            if (organizer.getId().equals(id)) {
                organizers.remove(organizer);
                break;
            }
        }
    }

    public Iterator<Team> getTeamsIterator() {
        return teams.iterator();
    }

    public Iterator<Teacher> getTeachersIterator() {
        return teachers.iterator();
    }

    public Iterator<Organizer> getOrganizersIterator() {
        return organizers.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Activity").append('[')
                .append("id=").append(id)
                .append(", name=").append(name)
                .append(", startTime=").append(startTime)
                .append(", endTime=").append(endTime)
                .append(", description=").append(description)
                .append(", site=").append(site)
                .append(']');
        return sb.toString();
    }
}
