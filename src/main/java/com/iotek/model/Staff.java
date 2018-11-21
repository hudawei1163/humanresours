package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//员工
public class Staff implements Serializable{
    private int s_id;//工号
    private int p_id;//职位id
    private String s_name;//员工名字
    private String s_phone;
    private String s_pass;
    private double s_salary;
    private String s_status;//状态

    public Staff() {
    }

    public Staff(int s_id, int p_id) {
        this.s_id = s_id;
        this.p_id = p_id;
    }

    public Staff(int s_id, String s_pass) {
        this.s_id = s_id;
        this.s_pass = s_pass;
    }

    public Staff(int s_id, int p_id, double s_salary, String s_status) {
        this.s_id = s_id;
        this.p_id = p_id;
        this.s_salary = s_salary;
        this.s_status = s_status;
    }

    public Staff(int p_id, String s_name, String s_phone, String s_pass, double s_salary, String s_status) {
        this.p_id = p_id;
        this.s_name = s_name;
        this.s_phone = s_phone;
        this.s_pass = s_pass;
        this.s_salary = s_salary;
        this.s_status = s_status;
    }

    public Staff(int s_id, int p_id, String s_name, String s_phone, String s_pass, double s_salary, String s_status) {
        this.s_id = s_id;
        this.p_id = p_id;
        this.s_name = s_name;
        this.s_phone = s_phone;
        this.s_pass = s_pass;
        this.s_salary = s_salary;
        this.s_status = s_status;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    public String getS_pass() {
        return s_pass;
    }

    public void setS_pass(String s_pass) {
        this.s_pass = s_pass;
    }

    public double getS_salary() {
        return s_salary;
    }

    public void setS_salary(double s_salary) {
        this.s_salary = s_salary;
    }

    public String getS_status() {
        return s_status;
    }

    public void setS_status(String s_status) {
        this.s_status = s_status;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "s_id=" + s_id +
                ", p_id=" + p_id +
                ", s_name='" + s_name + '\'' +
                ", s_phone='" + s_phone + '\'' +
                ", s_pass='" + s_pass + '\'' +
                ", s_salary=" + s_salary +
                ", s_status='" + s_status + '\'' +
                '}';
    }
}
