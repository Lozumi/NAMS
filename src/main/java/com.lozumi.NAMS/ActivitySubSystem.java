package com.lozumi.NAMS;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ActivitySubSystem 类用于管理校园活动的信息。
 */
public class ActivitySubSystem {
    List<Activity> activityList = new ArrayList<Activity>();//活动列表

    /**
     * 向活动列表中添加新活动。
     *
     * @param activity 要添加的活动对象。
     */
    public void addActivity(Activity activity){
        activityList.add(activity);
    }

    /**
     * 根据活动ID从活动列表中移除活动。
     *
     * @param id 要移除的活动的ID。
     */
    public void removeActivityById(String id){
        // 根据活动ID删除活动
        Activity activityToRemove = null;
        for (Activity activity : activityList) {
            if (activity.getId().equals(id)) {
                activityToRemove = activity;
                break;
            }
        }
        if (activityToRemove != null) {
            activityList.remove(activityToRemove);
        }
    }

    /**
     * 根据活动ID获取活动信息。
     *
     * @param id 活动的ID。
     * @return 活动对象，如果找不到则返回null。
     */
    public Activity getActivityById(String id){
        // 根据活动ID查找活动并返回
        for (Activity activity : activityList) {
            if (activity.getId().equals(id)) {
                return activity;
            }
        }
        return null; // 如果找不到活动，则返回null
    }

    /**
     * 根据日期获取与给定日期相交的所有活动。
     *
     * @param date 日期对象。
     * @return 包含相交的活动列表。
     */
    public ArrayList<Activity> getActivitiesByDate(Date date) {
        List<Activity> matchingActivities = new ArrayList<>();

        // 根据日期查找与给定日期相交的活动
        for (Activity activity : activityList) {
            if (activity.getStartTime().compareTo(date) <= 0 && activity.getEndTime().compareTo(date) >= 0) {
                matchingActivities.add(activity);
            }
        }
        return matchingActivities.stream().collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * 获取所有活动的列表。
     *
     * @return 包含所有活动的列表。
     */
    public List<Activity> getActivityList(){
        // 返回所有活动列表
        return activityList;
    }

    /**
     * 计算特定团队参与的活动数量。
     *
     * @param teamId 团队的ID。
     * @return 特定团队参与的活动数量。
     */
    public int checkActivityNumOfTeam(String teamId) {
        // 计算特定团队参与的活动数量
        int count = 0;
        for (Activity activity : activityList) {
            Iterator<Team> teamIterator = activity.getTeamsIterator(); // 使用迭代器方法获取团队迭代器
            while (teamIterator.hasNext()) {
                Team team = teamIterator.next();
                if (team.getTeamId().equals(teamId)) {
                    count++;
                }
            }
        }
        return count;
    }
}
