package com.iotek.service.impl;

import com.iotek.dao.RewardsDao;
import com.iotek.model.Rewards;
import com.iotek.service.RewardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class RewardsServiceImpl implements RewardsService {
@Resource
private RewardsDao rewardsDao;

    @Override
    public boolean addRewards(Rewards rewards) {
        return rewardsDao.addRewards(rewards);
    }

    @Override
    public boolean updateRewards(Rewards rewards) {
        return rewardsDao.updateRewards(rewards);
    }

    @Override
    public List<Rewards> queryAllRewards() {
        return rewardsDao.queryAllRewards();
    }

    @Override
    public List<Rewards> queryAllRewardsById(int s_id) {
        return rewardsDao.queryAllRewardsById(s_id);
    }

    @Override
    public Rewards queryRewards(int rw_id) {
        return rewardsDao.queryRewards(rw_id);
    }


}
