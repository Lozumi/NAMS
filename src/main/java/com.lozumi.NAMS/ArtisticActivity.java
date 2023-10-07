package com.lozumi.NAMS;

public class ArtisticActivity extends Activity {
    String type;
    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArtisticActivity").append('[')
                .append("type=")
                .append(type)
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
