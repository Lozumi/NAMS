package com.lozumi.NAMS;

public class PartyActivity extends Activity {
    String theme;
    String classification;
    public String getTheme(){
        return this.theme;
    }
    public String getClassification(){
        return this.classification;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PartyActivity").append('[')
                .append("theme=")
                .append(theme)
                .append("_classification=")
                .append(classification)
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
