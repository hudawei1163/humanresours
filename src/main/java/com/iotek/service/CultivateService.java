package com.iotek.service;

import com.iotek.model.Cultivate;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface CultivateService {
    boolean addCultivate(Cultivate cultivate);
    boolean updateCultivate(Cultivate cultivate);
    boolean deleteCultivate(Cultivate cultivate);
    List<Cultivate> queryAllCultivate();
    List<Cultivate> queryAllStaffCultivate(int s_id);
    Cultivate queryCultivate(int c_id);
}
