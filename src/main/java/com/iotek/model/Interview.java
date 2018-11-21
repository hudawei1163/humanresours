package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//面试
public class Interview implements Serializable{
    private int i_id;
    private int r_id;//简历id
    private int u_id;
    private String u_name;
    private String r_phone;
    private String p_name;//招聘职位
    private String i_status;//状态(通过和未通过)
    private String i_date; //面试日期

    public Interview() {
    }

    public Interview(int r_id, int u_id, String u_name, String r_phone, String p_name, String i_status, String i_date) {
        this.r_id = r_id;
        this.u_id = u_id;
        this.u_name = u_name;
        this.r_phone = r_phone;
        this.p_name = p_name;
        this.i_status = i_status;
        this.i_date = i_date;
    }

    public Interview(int i_id, int r_id, int u_id, String u_name, String r_phone, String p_name, String i_status, String i_date) {
        this.i_id = i_id;
        this.r_id = r_id;
        this.u_id = u_id;
        this.u_name = u_name;
        this.r_phone = r_phone;
        this.p_name = p_name;
        this.i_status = i_status;
        this.i_date = i_date;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getI_status() {
        return i_status;
    }

    public void setI_status(String i_status) {
        this.i_status = i_status;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getI_date() {
        return i_date;
    }

    public void setI_date(String i_date) {
        this.i_date = i_date;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "i_id=" + i_id +
                ", r_id=" + r_id +
                ", p_name='" + p_name + '\'' +
                ", i_date='" + i_date + '\'' +
                '}';
    }
}
