package com.iotek.dao;

import com.iotek.model.Interview;

import java.util.List;

/**
 * Created by lenovo on 2018/10/19.
 */
//面试
public interface InterviewDao {
    boolean addInterview(Interview interview);
    boolean updateInterview(Interview interview);
    List<Interview> queryAllInterview();
    Interview queryInterview(int i_id);//通过id查


}
