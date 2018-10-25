package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//员工
public class Staff implements Serializable{
    private int s_id;
    private String s_phone;
    private String s_pass;
    private int s_p_id;//职位id

    public Staff(String s_phone, String s_pass) {
        this.s_phone = s_phone;
        this.s_pass = s_pass;
    }

    public Staff(String s_phone, String s_pass, int s_p_id) {
        this.s_phone = s_phone;
        this.s_pass = s_pass;
        this.s_p_id = s_p_id;
    }
}
