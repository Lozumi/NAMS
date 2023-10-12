package com.lozumi.NAMS;

import java.util.Date;

/**
 * 讲座活动类，继承自活动类。
 */
public class LectureActivity extends Activity {
    String keySpeaker;

    /**
     * 构造一个讲座活动对象。
     *
     * @param id          活动ID
     * @param name        活动名称
     * @param startTime   活动开始时间
     * @param endTime     活动结束时间
     * @param description 活动描述
     * @param site        活动地点
     * @param keySpeaker  主讲人
     */
    public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site, String keySpeaker) {
        super(id, name, startTime, endTime, description, site);
        this.keySpeaker = keySpeaker;
    }

    /**
     * 获取讲座活动的主讲人。
     *
     * @return 主讲人
     */
    public String getKeySpeaker() {
        return this.keySpeaker;
    }

    /**
     * 将讲座活动对象转换为字符串表示。
     *
     * @return 字符串表示
     */
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
