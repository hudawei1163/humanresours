package com.iotek.service;

import com.iotek.model.Rewards;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface RewardsService {
    boolean addRewards(Rewards rewards);
    boolean updateRewards(Rewards rewards);
    boolean deleteRewards(Rewards rewards);
    List<Rewards> queryAllRewards();
    Rewards queryRewardsById(int r_id);
}
