package com.iotek.service;

import com.iotek.model.Recruit;

import java.util.List;

/**
 * Created by lenovo on 2018/10/19.
 */
//招聘
public interface RecruitService {
    boolean addRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    List<Recruit> queryAllRecruit();
    Recruit queryRecruit(int r_id);
}
