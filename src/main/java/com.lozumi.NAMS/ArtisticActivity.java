package com.lozumi.NAMS;

import java.util.Date;

/**
 * 艺术活动类，继承自活动类。
 */
public class ArtisticActivity extends Activity {
    String type;

    /**
     * 构造一个艺术活动对象。
     *
     * @param id          活动ID
     * @param name        活动名称
     * @param startTime   活动开始时间
     * @param endTime     活动结束时间
     * @param description 活动描述
     * @param site        活动地点
     * @param type        艺术活动类型
     */
    public ArtisticActivity(String id, String name, Date startTime, Date endTime, String description, String site, String type) {
        super(id, name, startTime, endTime, description, site);
        this.type = type;
    }

    /**
     * 获取艺术活动的类型。
     *
     * @return 艺术活动类型
     */
    public String getType() {
        return this.type;
    }

    /**
     * 将艺术活动对象转换为字符串表示。
     *
     * @return 字符串表示
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
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
