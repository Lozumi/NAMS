package com.lozumi.NAMS;

import java.util.Date;

public class LectureActivity extends Activity {
    String keySpeaker;

    public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site, String keySpeaker) {
        super(id, name, startTime, endTime, description, site);
        this.keySpeaker = keySpeaker;
    }

    public String getKeySpeaker(){
        return this.keySpeaker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(keySpeaker)
                .append("_")
                .append(id)
                .append("_")
                .append(name)
                .append("_")
                .append(startTime)
                .append("_")
                .append(endTime)
                .append("_")
                .append(description)
                .append("_")
                .append(site)
                .append("_")
                .append(teams)
                .append("_")
                .append(teachers)
                .append("_")
                .append(organizers);
        return sb.toString();
    }
}
