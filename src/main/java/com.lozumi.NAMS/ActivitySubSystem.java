package com.lozumi.NAMS;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class ActivitySubSystem {
    List<Activity> aList = new ArrayList<>();
    public void addActivity(Activity activity){
        aList.add(activity);
    }

    public void removeActivityById(String id){
        // 根据活动ID删除活动
        Activity activityToRemove = null;
        for (Activity activity : aList) {
            if (activity.getId().equals(id)) {
                activityToRemove = activity;
                break;
            }
        }
        if (activityToRemove != null) {
            aList.remove(activityToRemove);
        }
    }

    public Activity getActivityById(String id){
        // 根据活动ID查找活动并返回
        for (Activity activity : aList) {
            if (activity.getId().equals(id)) {
                return activity;
            }
        }
        return null; // 如果找不到活动，则返回null
    }

    public Activity getActivityByDate(Date date){
        // 根据日期查找活动并返回
        for (Activity activity : aList) {
            if (activity.getStartTime().compareTo(date) <= 0 && activity.getEndTime().compareTo(date) >= 0) {
                return activity;
            }
        }
        return null; // 如果找不到活动，则返回null
    }

    public List<Activity> getActivityList(){
        // 返回所有活动列表
        return aList;
    }

    public int checkActivityNumOfTeam(String teamId){
        // 计算特定团队参与的活动数量
        int count = 0;
        for (Activity activity : aList) {
            for (Team team : activity.getTeamsIterator()) {
                if (team.getTeamId().equals(teamId)) {
                    count++;
                }
            }
        }
        return count;
    }
}
