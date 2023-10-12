package com.lozumi.NAMS;

import java.util.Objects;

/**
 * 用户类，用于表示系统中的用户信息。
 */
public class User {
    String id;
    String name;
    String phoneNo;
    String email;

    /**
     * 创建一个空的用户对象。
     */
    public User(){};

    /**
     * 创建一个用户对象，提供用户的基本信息。
     *
     * @param id      用户的唯一标识ID。
     * @param name    用户的姓名。
     * @param phoneNo 用户的电话号码。
     * @param email   用户的电子邮件地址。
     */
    public User(String id, String name, String phoneNo, String email) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    /**
     * 获取用户的唯一标识ID。
     *
     * @return 用户ID。
     */
    public String getId() {
        return id;
    }

    /**
     * 获取用户的姓名。
     *
     * @return 用户姓名。
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户的姓名。
     *
     * @param name 要设置的姓名。
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户的电话号码。
     *
     * @return 用户电话号码。
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 获取用户的电子邮件地址。
     *
     * @return 用户电子邮件地址。
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户的电子邮件地址。
     *
     * @param email 要设置的电子邮件地址。
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 判断用户对象是否与另一个对象相等。
     *
     * @param o 要比较的对象。
     * @return 如果两个用户对象相等，则返回 true；否则返回 false。
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    /**
     * 获取用户对象的哈希码。
     *
     * @return 用户对象的哈希码。
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * 获取用户对象的字符串表示，包括用户ID、姓名、电话号码和电子邮件地址的信息。
     *
     * @return 代表用户的字符串。
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder()
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
