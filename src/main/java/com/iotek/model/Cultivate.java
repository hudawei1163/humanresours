package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//培训
public class Cultivate implements Serializable{
    private int c_id;
    private int s_id;
    private String c_theme;//主题
    private String c_start_time;
    private String c_end_time;
    private String c_address;
    //c_id s_id c_theme c_start_time c_end_time c_address
    // C_ID,S_ID,C_THEME,C_START_TIME,C_END_TIME,C_ADDRESS

    public Cultivate() {
    }

    public Cultivate(int s_id, String c_theme, String c_start_time, String c_end_time, String c_address) {
        this.s_id = s_id;
        this.c_theme = c_theme;
        this.c_start_time = c_start_time;
        this.c_end_time = c_end_time;
        this.c_address = c_address;
    }

    public Cultivate(int c_id, int s_id, String c_theme, String c_start_time, String c_end_time, String c_address) {
        this.c_id = c_id;
        this.s_id = s_id;
        this.c_theme = c_theme;
        this.c_start_time = c_start_time;
        this.c_end_time = c_end_time;
        this.c_address = c_address;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getC_theme() {
        return c_theme;
    }

    public void setC_theme(String c_theme) {
        this.c_theme = c_theme;
    }

    public String getC_start_time() {
        return c_start_time;
    }

    public void setC_start_time(String c_start_time) {
        this.c_start_time = c_start_time;
    }

    public String getC_end_time() {
        return c_end_time;
    }

    public void setC_end_time(String c_end_time) {
        this.c_end_time = c_end_time;
    }

    public String getC_address() {
        return c_address;
    }

    public void setC_address(String c_address) {
        this.c_address = c_address;
    }
}
