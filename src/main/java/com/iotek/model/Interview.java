package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//面试
public class Interview implements Serializable{
    private int i_id;
    private String r_name;//简历名
    private String i_department;//部门
    private String p_id;//招聘职位
    private String i_date; //面试日期

    public Interview(String r_name, String i_department, String p_id, String i_date) {
        this.r_name = r_name;
        this.i_department = i_department;
        this.p_id = p_id;
        this.i_date = i_date;
    }
}
