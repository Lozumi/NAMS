package com.lozumi.NAMS;

public class ActivityManagementSystem {
    UserSubSystem usSystem = new UserSubSystem();
    ActivitySubSystem asSystem = new ActivitySubSystem();
    public void displayUserSubSystem(){
        System.out.println(usSystem);
    }
    public void displayActivitySubSystem(){
        System.out.println(asSystem);
    }
    public UserSubSystem getUserSubSystem(){
        return usSystem;
    }
    public ActivitySubSystem getActivitySubSystem() {
        return asSystem;
    }
}
