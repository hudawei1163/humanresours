package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//部门
public class Department implements Serializable{
    private int d_id;
    private String d_name;//部门名称
    private String d_time;//创建时间

    public Department() {
    }

    public Department(String d_name) {
        this.d_name = d_name;
    }

    public Department(int d_id, String d_name) {
        this.d_id = d_id;
        this.d_name = d_name;
    }

    public Department(int d_id, String d_name, String d_time) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_time = d_time;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_time() {
        return d_time;
    }

    public void setD_time(String d_time) {
        this.d_time = d_time;
    }
}
