package com.iotek.service.impl;

import com.iotek.dao.InterviewDao;
import com.iotek.model.Interview;
import com.iotek.service.InterviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
@Service
public class InterviewServiceImpl implements InterviewService {
    @Resource
    private InterviewDao interviewDao;
    @Override
    public boolean addInterview(Interview interview) {
        return interviewDao.addInterview(interview);
    }

    @Override
    public boolean updateInterview(Interview interview) {
        return interviewDao.updateInterview(interview);
    }

    @Override
    public boolean deleteInterview(Interview interview) {
        return interviewDao.deleteInterview(interview);
    }

    @Override
    public List<Interview> queryAllInterview() {
        return interviewDao.queryAllInterview();
    }

    @Override
    public Interview queryRecruit(Interview interview) {
        return interviewDao.queryRecruit(interview);
    }
}
