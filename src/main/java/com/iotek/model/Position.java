package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//职位
public class Position implements Serializable{
    private int p_id;//职位id
    private int d_id;//部门id
    private String p_name;//职位名称
    public Position() {
    }

    public Position(String p_name) {
        this.p_name = p_name;
    }

    public Position(int d_id, String p_name) {
        this.d_id = d_id;
        this.p_name = p_name;
    }

    public Position(int p_id, int d_id, String p_name) {
        this.p_id = p_id;
        this.d_id = d_id;
        this.p_name = p_name;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "p_id=" + p_id +
                ", d_id=" + d_id +
                ", p_name='" + p_name + '\'' +
                '}';
    }
}
