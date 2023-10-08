package com.lozumi.NAMS; // 测试文件所在包

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.TestCase;

//import imp.*; // 实现文件所在包

public class Test extends TestCase {
	private ActivityManagementSystem amSystem = new ActivityManagementSystem();
	private UserSubSystem usSystem = amSystem.getUserSubSystem();
	private ActivitySubSystem asSystem = amSystem.getActivitySubSystem();

	/*
	 * 初始化系统
	 */
	private void initSystem() {
		/* 添加学生信息 */
		usSystem.addStudent(
				new Student("stu_001", "小明", "13139149931", "22352@qq.com", "2021223111", false, "本科二年级", "软件学院"));
		usSystem.addStudent(
				new Student("stu_004", "小红", "13139149932", "22152@qq.com", "2021223112", true, "本科二年级", "软件学院"));
		usSystem.addTeacher(new Teacher("tea_002", "肖老师", "15304114352", "xiao@nwpu.edu.cn", "01342", "软件学院"));
		usSystem.addOrganizer(new Organizer("stu_003", "软件学院官方", "010" + "-03901234", "software@nwpu.edu.cn", "软件学院"));

		/* 添加活动信息 */
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd " + "HH:mm:ss");
			Date sdate1 = new Date();
			Date edate1 = new Date();
			sdate1 = format.parse("2022-10-01 14:45:00");
			edate1 = format.parse("2022-10-04 17:00:00");
			ArtisticActivity act1 = new ArtisticActivity("act_001", "校园歌唱大赛", sdate1, edate1, "一年一度校园歌唱大赛",
					"http://www.singasong.nwpu" + ".edu.cn", "唱歌");
			asSystem.addActivity(act1);
			Date sdate2 = new Date();
			Date edate2 = new Date();
			sdate2 = format.parse("2022-10-09 14:00:00");
			edate2 = format.parse("2022-10-09 17:00:00");
			LectureActivity act2 = new LectureActivity("act_002", "翱翔讲座", sdate2, edate2, "人工智能主题专讲",
					"http://www.lecture.nwpu.edu" + ".cn", "陈晶");
			asSystem.addActivity(act2);
			Date sdate3 = new Date();
			Date edate3 = new Date();
			sdate3 = format.parse("2022-10-11 14:00:00");
			edate3 = format.parse("2022-10-11 17:00:00");
			PartyActivity act3 = new PartyActivity("act_003", "党日活动", sdate3, edate3, "人人讲党课",
					"http://www.dangri.nwpu.edu.cn", "喜迎二十大", "党课");
			asSystem.addActivity(act3);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/* 添加团队信息 */
		usSystem.createTeam("stu_001", "team_001", "科技与狠活队", "软件学院");
		usSystem.addStudentToTeam("stu_001", "stu_004", "team_001");
		usSystem.addTeacherToTeam("stu_001", "tea_002", "team_001");
	}

	/**
	 * 测试系统初始化功能：添加学生、添加老师、添加组织者、添加活动、添加团队
	 */
	public void test00() {
		try {
			System.out.println("Test 0 : 测试系统初始化功能");
			initSystem();
			System.out.println("Test 0 : successful!");
		} catch (Exception e) {
			System.out.println("Test 0 : failed[异常退出]!");
		}
	}

	/**
	 * 查看所有的用户（学生、教师、主办方）信息
	 */
	public void test01() {
		try {
			initSystem();
			System.out.println("Test 1 : 查看所有的用户（学生、教师、主办方）信息");
			amSystem.displayUserSubSystem();
			System.out.println("Test 1 : successful!");
		} catch (Exception e) {
			System.out.println("Test 1 : failed[异常退出]!");
		}
	}

	/**
	 * 查看所有的活动信息
	 */
	public void test02() {
		try {
			initSystem();
			System.out.println("Test 2 : 查看所有的活动信息");
			amSystem.displayActivitySubSystem();
			System.out.println("Test 2 : successful!");
		} catch (Exception e) {
			System.out.println("Test 2 : failed[异常退出]!");
		}
	}

	/**
	 * 增、删、改、查学生/教师/主办方信息
	 */
	public void test03() {
		try {
			initSystem();
			System.out.println("Test 3 : 增、删、改、查学生/教师/主办方信息");
			// 学生的增删改查
			usSystem.addStudent(
					new Student("stu_004", "小红", "13139149932", "22152@qq.com", "2021223112", true, "本科二年级", "软件学院"));
			Student stu2 = usSystem.getStudentById("stu_004");
			stu2.setEmail("235462@qq.com");
			usSystem.removeStudentById("stu_004");
			// 教师的增删改查
			usSystem.addTeacher(new Teacher("tea_005", "马老师", "15334114352", "ma@nwpu.edu.cn", "01242", "软件学院"));
			Teacher tea2 = usSystem.getTeacherById("tea_005");
			tea2.setDepartment("计算机学院");
			usSystem.removeTeacherById("tea_005");
			// 主办方的增删改查
			usSystem.addOrganizer(
					new Organizer("org_006", "计算机学院官方", "010" + "-03904534", "compute@nwpu.edu.cn", "计算机学院"));
			Organizer org2 = usSystem.getOrganizerById("org_006");
			org2.setName("计算机学院院办");
			usSystem.removeOrganizerById("org_006");
			System.out.println("Test 3 : successful!");
		} catch (Exception e) {
			System.out.println("Test 3 : failed[异常退出]!");
		}
	}

	/**
	 * 增、删、改、查活动信息
	 */
	public void test04() {
		try {
			initSystem();
			System.out.println("Test 4 : 增、删、改、查活动信息");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd " + "HH:mm:ss");
			Date sdatex = new Date();
			Date edatex = new Date();
			sdatex = format.parse("2022-10-01 14:45:00");
			edatex = format.parse("2022-10-04 17:00:00");
			ArtisticActivity act1 = new ArtisticActivity("act_004", "街舞艺术节", sdatex, edatex, "翱翔会议厅，等你来共舞",
					"http://www.dance.nwpu.edu" + ".cn", "跳舞");
			asSystem.addActivity(act1);
			Activity act = asSystem.getActivityById("act_004");
			act.setDescription("翱翔大厅，街舞专场，与你共舞");
			asSystem.removeActivityById("act_004");
			System.out.println("Test 4 : successful!");
		} catch (Exception e) {
			System.out.println("Test 4 : failed[异常退出]!");
		}
	}

	/**
	 * 根据时间筛选活动（查看某一时间有哪些活动正在举行）
	 */
	public void test05() {
		try {
			initSystem();
			System.out.println("Test 5 : 根据时间筛选活动");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd " + "HH:mm:ss");
			Date date = new Date();
			date = format.parse("2022-10-02 14:00:00");
			ArrayList<Activity> acts = asSystem.getActivitiesByDate(date);
			// 符合逻辑才能通过
			if (acts.size() == 1 && acts.get(0).getId().equals("act_001"))
				System.out.println("Test 5 : successful!");
			else
				System.out.println("Test 5 : failed[逻辑错误]!");
		} catch (Exception e) {
			System.out.println("Test 5 : failed[异常退出]!");
		}
	}

	/**
	 * 将团队添加到某项活动中（报名）、从某项活动中删除团队（撤销报名）
	 */
	public void test06() {
		try {
			initSystem();
			System.out.println("Test 6 : 将团队添加到某项活动中（报名）、从某项活动中删除团队（撤销报名）");
			// 将 team1 添加到 act1
			Activity act = asSystem.getActivityById("act_001");
			Student stu = usSystem.getStudentById("stu_001");
			ArrayList<Team> teams = stu.getTeamList();
			Team team = teams.get(0);
			act.addTeamToActivity(team);
			act.removeTeamFromActivity("team_001");
			System.out.println("Test 6 : successful!");
		} catch (Exception e) {
			System.out.println("Test 6 : failed[异常退出]!");
		}
	}

	/**
	 * 将教师添加到某项活动中、从某项活动中删除教师
	 */
	public void test07() {
		try {
			initSystem();
			System.out.println("Test 7 : 将教师添加到某项活动中、从某项活动中删除教师");
			// 将 tea1 添加到 act1
			Teacher tea = new Teacher("tea_010", "吕老师", "153666888", "lv@nwpu" + ".edu.cn", "01145", "软件学院");
			asSystem.getActivityById("act_001").addTeacherToActivity(tea);
			asSystem.getActivityById("act_001").removeTeacherFromActivity("tea_010");
			System.out.println("Test 7 : successful!");
		} catch (Exception e) {
			System.out.println("Test 7 : failed[异常退出]!");
		}
	}

	/**
	 * 将主办方添加到某项活动中、从某项活动中删除主办方
	 */
	public void test08() {
		try {
			initSystem();
			System.out.println("Test 8 : 将主办方添加到某项活动中、从某项活动中删除主办方");
			Organizer org = new Organizer("011", "软件学院官方", "010-03901234", "software@nwpu.edu.cn", "软件学院");
			asSystem.getActivityById("act_001").addOrganizerToActivity(org);
			asSystem.getActivityById("act_001").removeOrganizerFromActivity("011");
			System.out.println("Test 8 : successful!");
		} catch (Exception e) {
			System.out.println("Test 8 : failed[异常退出]!");
		}
	}

	/**
	 * 检查某个团队是否参加了多项活动
	 */
	public void test09() {
		try {
			initSystem();
			System.out.println("Test 9 : 检查某个团队是否参加了多项活动");
			// 让 team1 参加 三个 活动
			Activity act1 = asSystem.getActivityById("act_001");
			Activity act2 = asSystem.getActivityById("act_002");
			Activity act3 = asSystem.getActivityById("act_003");
			Student stu = usSystem.getStudentById("stu_001");
			ArrayList<Team> teams = stu.getTeamList();
			Team team = teams.get(0); // team_001
			act1.addTeamToActivity(team);
			act2.addTeamToActivity(team);
			act3.addTeamToActivity(team);
			asSystem.checkActivityNumOfTeam("team_001");
			System.out.println("Test 9 : successful!");
		} catch (Exception e) {
			System.out.println("Test 9 : failed[异常退出]!");
		}
	}

	/**
	 * 创建团队、添加团队成员（学生）、添加指导老师（教师）
	 */
	public void test10() {
		try {
			initSystem();
			System.out.println("Test 10 : 创建团队，将学生/老师加入团队");
			usSystem.createTeam("stu_001", "team_002", "啥也不是队", "计算机学院");
			usSystem.addStudentToTeam("stu_001", "stu_004", "team_002");
			usSystem.addTeacherToTeam("stu_001", "tea_002", "team_002");
			System.out.println("Test 10 : successful!");
		} catch (Exception e) {
			System.out.println("Test 10 : failed[异常退出]!");
		}
	}
}
