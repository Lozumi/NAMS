package com.lozumi.NAMS;

import java.util.Date;

public class PartyActivity extends Activity {
    String theme;
    String classification;

    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site, String theme, String classification) {
        super(id, name, startTime, endTime, description, site);
        this.theme = theme;
        this.classification = classification;
    }

    public String getTheme(){
        return this.theme;
    }
    public String getClassification(){
        return this.classification;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PartyActivity")
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
