package com.lozumi.NAMS;

import javax.swing.text.html.HTMLDocument;
import java.util.Date;
import java.util.Objects;

public class Activity {
    String id;
    String name;
    Date startTime;
    Date endTime;
    String description;
    String site;

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

    public void addTeamToActivity(Team team){

    }
    public void removeTeamFromActivity(String id){

    }
    public void addTeacherToActivity(Teacher teacher){

    }
    public void removeTeacherFromActivity(String id){

    }
    public void addOrganizerToActivity(Organizer organizer){

    }
    public void removeOrganizerFromActivity(String id){

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

    public Iterator getTeamsIterator(){

    }
    public Iterator getTeachersIterator(){

    }
    public Iterator getOrganizersIterator(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Activity").append('[')
                .append("id=")
                .append(id)
                .append("_name=")
                .append(name)
                .append("_startTime=")
                .append(startTime)
                .append("_endTime=")
                .append(endTime)
                .append("_description=")
                .append(description)
                .append("_site=")
                .append(site)
                .append(']');
        return sb.toString();
    }
}

