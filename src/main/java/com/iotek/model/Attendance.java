package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//考勤
public class Attendance implements Serializable{
    private int a_id;
    private int s_id;//员工id
    private String a_up_work;//上班时间
    private String a_down_work;//下班时间
    private String a_state;//状态

    public Attendance() {
    }

    public Attendance(int s_id, String a_up_work, String a_down_work, String a_state) {
        this.s_id = s_id;
        this.a_up_work = a_up_work;
        this.a_down_work = a_down_work;
        this.a_state = a_state;
    }

    public Attendance(int a_id, int s_id, String a_up_work, String a_down_work, String a_state) {
        this.a_id = a_id;
        this.s_id = s_id;
        this.a_up_work = a_up_work;
        this.a_down_work = a_down_work;
        this.a_state = a_state;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getA_up_work() {
        return a_up_work;
    }

    public void setA_up_work(String a_up_work) {
        this.a_up_work = a_up_work;
    }

    public String getA_down_work() {
        return a_down_work;
    }

    public void setA_down_work(String a_down_work) {
        this.a_down_work = a_down_work;
    }

    public String getA_state() {
        return a_state;
    }

    public void setA_state(String a_state) {
        this.a_state = a_state;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "a_id=" + a_id +
                ", s_id=" + s_id +
                ", a_up_work='" + a_up_work + '\'' +
                ", a_down_work='" + a_down_work + '\'' +
                ", a_state='" + a_state + '\'' +
                '}';
    }
}
