package com.iotek.model;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/10/19.
 */
//简历
public class Resume implements Serializable {
    private int r_id;
    private String r_name;//姓名
    private String r_education;//学历
    private String r_sex;//性别
    private String r_birthplace;// 籍贯
    private String r_phone;//手机
    private String r_mail;// 邮箱
    private String r_birthdate;//出生日期
    private String r_status;// 政治面貌
    private String r_idNumber;//证件号码
    private String r_abode;// 现居住地
    private String r_jobIntention;//求职意向
    private String r_workExperience; // 工作经验
    private String r_deliver; //是否投递
    private String r_read;//未读和已读

    public Resume(String r_name, String r_education, String r_sex, String r_birthplace, String r_phone, String r_mail, String r_birthdate, String r_status, String r_idNumber, String r_abode, String r_jobIntention, String r_workExperience, String r_deliver, String r_read) {
        this.r_name = r_name;
        this.r_education = r_education;
        this.r_sex = r_sex;
        this.r_birthplace = r_birthplace;
        this.r_phone = r_phone;
        this.r_mail = r_mail;
        this.r_birthdate = r_birthdate;
        this.r_status = r_status;
        this.r_idNumber = r_idNumber;
        this.r_abode = r_abode;
        this.r_jobIntention = r_jobIntention;
        this.r_workExperience = r_workExperience;
        this.r_deliver = r_deliver;
        this.r_read = r_read;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public String getR_birthplace() {
        return r_birthplace;
    }

    public void setR_birthplace(String r_birthplace) {
        this.r_birthplace = r_birthplace;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_mail() {
        return r_mail;
    }

    public void setR_mail(String r_mail) {
        this.r_mail = r_mail;
    }

    public String getR_birthdate() {
        return r_birthdate;
    }

    public void setR_birthdate(String r_birthdate) {
        this.r_birthdate = r_birthdate;
    }

    public String getR_status() {
        return r_status;
    }

    public void setR_status(String r_status) {
        this.r_status = r_status;
    }

    public String getR_idNumber() {
        return r_idNumber;
    }

    public void setR_idNumber(String r_idNumber) {
        this.r_idNumber = r_idNumber;
    }

    public String getR_abode() {
        return r_abode;
    }

    public void setR_abode(String r_abode) {
        this.r_abode = r_abode;
    }

    public String getR_jobIntention() {
        return r_jobIntention;
    }

    public void setR_jobIntention(String r_jobIntention) {
        this.r_jobIntention = r_jobIntention;
    }

    public String getR_workExperience() {
        return r_workExperience;
    }

    public void setR_workExperience(String r_workExperience) {
        this.r_workExperience = r_workExperience;
    }

    public String getR_deliver() {
        return r_deliver;
    }

    public void setR_deliver(String r_deliver) {
        this.r_deliver = r_deliver;
    }

    public String getR_read() {
        return r_read;
    }

    public void setR_read(String r_read) {
        this.r_read = r_read;
    }
}