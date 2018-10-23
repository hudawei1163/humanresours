package com.iotek.service.impl;

import com.iotek.dao.RecruitDao;
import com.iotek.model.Recruit;
import com.iotek.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitDao recruitDao;
    @Override
    public boolean addRecruit(Recruit recruit) {
        return recruitDao.addRecruit(recruit);
    }

    @Override
    public boolean updateRecruit(Recruit recruit) {
        return recruitDao.updateRecruit(recruit);
    }

    @Override
    public boolean deleteRecruit(Recruit recruit) {
        return recruitDao.deleteRecruit(recruit);
    }

    @Override
    public List<Recruit> queryAllRecruit() {
        return recruitDao.queryAllRecruit();
    }

    @Override
    public Recruit queryRecruit(Recruit recruit) {
        return recruitDao.queryRecruit(recruit);
    }
}
