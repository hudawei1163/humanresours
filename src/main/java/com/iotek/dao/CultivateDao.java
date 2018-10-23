package com.iotek.dao;

import com.iotek.model.Cultivate;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface CultivateDao {
    boolean addCultivate(Cultivate cultivate);
    boolean updateCultivate(Cultivate cultivate);
    boolean deleteCultivate(Cultivate cultivate);
    List<Cultivate> queryAllCultivate();
    Cultivate queryCultivate(Cultivate cultivate);
}
