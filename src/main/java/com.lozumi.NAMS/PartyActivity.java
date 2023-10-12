package com.lozumi.NAMS;

import java.util.Date;

/**
 * 党日活动类，表示一个党日活动。
 */
public class PartyActivity extends Activity {
    String theme;
    String classification;

    /**
     * 构造一个党日活动对象。
     *
     * @param id             党日活动ID
     * @param name           党日活动名称
     * @param startTime      派对开始时间
     * @param endTime        派对结束时间
     * @param description    党日活动描述
     * @param site           党日活动地点
     * @param theme          派对主题
     * @param classification 派对分类
     */
    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site, String theme, String classification) {
        super(id, name, startTime, endTime, description, site);
        this.theme = theme;
        this.classification = classification;
    }

    /**
     * 获取党日活动的主题。
     *
     * @return 派对主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 获取党日活动的分类。
     *
     * @return 派对分类
     */
    public String getClassification() {
        return classification;
    }

    /**
     * 重写父类的 toString 方法，返回党日活动的信息字符串。
     *
     * @return 包含派对主题、分类、ID、名称、开始时间、结束时间、描述和地点的字符串
     */
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
