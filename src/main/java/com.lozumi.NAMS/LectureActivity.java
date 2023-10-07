package com.lozumi.NAMS;

public class LectureActivity extends Activity {
    String keySpeaker;
    public String getKeySpeaker(){
        return this.keySpeaker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LectureActivity")
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
