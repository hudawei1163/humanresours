package com.iotek.model;

/**
 * Created by lenovo on 2018/10/19.
 */
//员工
public class Staff {
    private int s_id;
    private String s_phone;
    private String s_pass;
    //private int s_d_id;//部门id
    private String s_d_name;//部门名称
    //private int s_p_id;//职位id
    private String s_p_name;//职位名称

    public Staff(String s_phone, String s_pass) {
        this.s_phone = s_phone;
        this.s_pass = s_pass;
    }
}
