package com.lozumi.NAMS;

public class ArtisticActivity extends Activity {
    String type;
    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArtisticActivity")
                .append(type)
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
