package com.lozumi.NAMS;

public class LectureActivity extends Activity {
    String keySpeaker;
    public String getKeySpeaker(){
        return this.keySpeaker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LectureActivity").append('[')
                .append("keySpeaker=")
                .append(keySpeaker)
                .append("_id=")
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
