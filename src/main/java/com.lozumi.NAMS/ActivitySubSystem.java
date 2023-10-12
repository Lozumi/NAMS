package com.lozumi.NAMS;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ActivitySubSystem {
    List<Activity> activityList = new ArrayList<Activity>();//activity list

    public void addActivity(Activity activity){
        activityList.add(activity);
    }

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

    public Activity getActivityById(String id){
        // 根据活动ID查找活动并返回
        for (Activity activity : activityList) {
            if (activity.getId().equals(id)) {
                return activity;
            }
        }
        return null; // 如果找不到活动，则返回null
    }

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

    public List<Activity> getActivityList(){
        // 返回所有活动列表
        return activityList;
    }

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
