package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//薪资
public class Salary implements Serializable{
    private int sl_id;//薪资id
    private int s_id;//员工id
    private double s_wage;//底薪
    private double s_fine;//罚款
    private double s_prize;//奖惩金
    private double s_salarys;//总计薪资
    private String s_month;//结算的月份
    private String s_time;//结算的时间

    public Salary() {
    }

    public Salary(int s_id, double s_wage, double s_fine, double s_prize, double s_salarys, String s_month, String s_time) {
        this.s_id = s_id;
        this.s_wage = s_wage;
        this.s_fine = s_fine;
        this.s_prize = s_prize;
        this.s_salarys = s_salarys;
        this.s_month = s_month;
        this.s_time = s_time;
    }

    public Salary(int sl_id, int s_id, double s_wage, double s_fine, double s_prize, double s_salarys, String s_month, String s_time) {
        this.sl_id = sl_id;
        this.s_id = s_id;
        this.s_wage = s_wage;
        this.s_fine = s_fine;
        this.s_prize = s_prize;
        this.s_salarys = s_salarys;
        this.s_month = s_month;
        this.s_time = s_time;
    }

    public int getSl_id() {
        return sl_id;
    }

    public void setSl_id(int sl_id) {
        this.sl_id = sl_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public double getS_wage() {
        return s_wage;
    }

    public void setS_wage(double s_wage) {
        this.s_wage = s_wage;
    }

    public double getS_fine() {
        return s_fine;
    }

    public void setS_fine(double s_fine) {
        this.s_fine = s_fine;
    }

    public double getS_prize() {
        return s_prize;
    }

    public void setS_prize(double s_prize) {
        this.s_prize = s_prize;
    }

    public double getS_salarys() {
        return s_salarys;
    }

    public void setS_salarys(double s_salarys) {
        this.s_salarys = s_salarys;
    }

    public String getS_month() {
        return s_month;
    }

    public void setS_month(String s_month) {
        this.s_month = s_month;
    }

    public String getS_time() {
        return s_time;
    }

    public void setS_time(String s_time) {
        this.s_time = s_time;
    }
}
