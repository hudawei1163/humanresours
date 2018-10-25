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
    /*p_manager;//经理
    p_groupLeader;//组长
    p_staff;//员工*/

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
}
