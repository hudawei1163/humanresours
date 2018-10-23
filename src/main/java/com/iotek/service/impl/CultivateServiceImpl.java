package com.iotek.service.impl;

import com.iotek.dao.CultivateDao;
import com.iotek.model.Cultivate;
import com.iotek.service.CultivateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class CultivateServiceImpl implements CultivateService {
    @Resource
    private CultivateDao cultivateDao;
    @Override
    public boolean addCultivate(Cultivate cultivate) {
        return cultivateDao.addCultivate(cultivate);
    }

    @Override
    public boolean updateCultivate(Cultivate cultivate) {
        return cultivateDao.updateCultivate(cultivate);
    }

    @Override
    public boolean deleteCultivate(Cultivate cultivate) {
        return cultivateDao.deleteCultivate(cultivate);
    }

    @Override
    public List<Cultivate> queryAllCultivate() {
        return cultivateDao.queryAllCultivate();
    }

    @Override
    public Cultivate queryCultivate(Cultivate cultivate) {
        return cultivateDao.queryCultivate(cultivate);
    }
}
