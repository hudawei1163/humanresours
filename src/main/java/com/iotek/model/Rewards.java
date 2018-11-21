package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//奖励惩罚
public class Rewards implements Serializable{
    private int rw_id;
    private int s_id; //员工id
    private double rw_salary;// 金额
    private String r_reason;// 原因
    private String r_date;//时间(年月日)

    public Rewards() {
    }

    public Rewards(int s_id, double rw_salary, String r_reason, String r_date) {
        this.s_id = s_id;
        this.rw_salary = rw_salary;
        this.r_reason = r_reason;
        this.r_date = r_date;
    }

    public Rewards(int rw_id, int s_id, double rw_salary, String r_reason, String r_date) {
        this.rw_id = rw_id;
        this.s_id = s_id;
        this.rw_salary = rw_salary;
        this.r_reason = r_reason;
        this.r_date = r_date;
    }

    public int getRw_id() {
        return rw_id;
    }

    public void setRw_id(int rw_id) {
        this.rw_id = rw_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public double getRw_salary() {
        return rw_salary;
    }

    public void setRw_salary(double rw_salary) {
        this.rw_salary = rw_salary;
    }

    public String getR_reason() {
        return r_reason;
    }

    public void setR_reason(String r_reason) {
        this.r_reason = r_reason;
    }

    public String getR_date() {
        return r_date;
    }

    public void setR_date(String r_date) {
        this.r_date = r_date;
    }

    @Override
    public String toString() {
        return "Rewards{" +
                "rw_id=" + rw_id +
                ", s_id=" + s_id +
                ", rw_salary=" + rw_salary +
                ", r_reason='" + r_reason + '\'' +
                ", r_date='" + r_date + '\'' +
                '}';
    }
}
