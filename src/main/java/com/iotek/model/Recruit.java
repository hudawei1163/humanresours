package com.iotek.model;

/**
 * Created by lenovo on 2018/10/19.
 */
//招聘信息
public class Recruit {
    private int r_id;
    private String p_id;//职位
    private String r_workExperience;//工作经验
    private String r_education;//学历
    private int r_peopleNumber;//招人数
    private String r_workplace;//工作地点
    private double r_salary;//薪资
    private String r_date; //日期

    public Recruit(String p_id, String r_workExperience, String r_education, int r_peopleNumber, String r_workplace, double r_salary, String r_date) {
        this.p_id = p_id;
        this.r_workExperience = r_workExperience;
        this.r_education = r_education;
        this.r_peopleNumber = r_peopleNumber;
        this.r_workplace = r_workplace;
        this.r_salary = r_salary;
        this.r_date = r_date;
    }

    public Recruit(int r_id, String p_id, String r_workExperience, String r_education, int r_peopleNumber, String r_workplace, double r_salary, String r_date) {
        this.r_id = r_id;
        this.p_id = p_id;
        this.r_workExperience = r_workExperience;
        this.r_education = r_education;
        this.r_peopleNumber = r_peopleNumber;
        this.r_workplace = r_workplace;
        this.r_salary = r_salary;
        this.r_date = r_date;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getR_workExperience() {
        return r_workExperience;
    }

    public void setR_workExperience(String r_workExperience) {
        this.r_workExperience = r_workExperience;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public int getR_peopleNumber() {
        return r_peopleNumber;
    }

    public void setR_peopleNumber(int r_peopleNumber) {
        this.r_peopleNumber = r_peopleNumber;
    }

    public String getR_workplace() {
        return r_workplace;
    }

    public void setR_workplace(String r_workplace) {
        this.r_workplace = r_workplace;
    }

    public double getR_salary() {
        return r_salary;
    }

    public void setR_salary(double r_salary) {
        this.r_salary = r_salary;
    }

    public String getR_date() {
        return r_date;
    }

    public void setR_date(String r_date) {
        this.r_date = r_date;
    }
}
