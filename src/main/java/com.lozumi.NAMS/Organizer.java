package com.lozumi.NAMS;

/**
 * 主办方类，表示一个主办方用户。
 */
public class Organizer extends User {
    String unit;

    /**
     * 构造一个主办方对象。
     *
     * @param id      主办方ID
     * @param name    主办方名称
     * @param phoneNo 主办方电话号码
     * @param email   主办方电子邮件
     * @param unit    主办方单位
     */
    public Organizer(String id, String name, String phoneNo, String email, String unit) {
        super(id, name, phoneNo, email);
        this.unit = unit;
    }

    /**
     * 获取主办方的单位信息。
     *
     * @return 主办方单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 重写父类的 toString 方法，返回主办方的信息字符串。
     *
     * @return 包含主办方单位、ID、名称、电话号码和电子邮件的字符串
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(unit)
                .append("_")
                .append(id)
                .append("_")
                .append(name)
                .append("_")
                .append(phoneNo)
                .append("_")
                .append(email);
        return sb.toString();
    }
}
