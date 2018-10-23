package com.iotek.service.impl;

import com.iotek.dao.PositionDao;
import com.iotek.model.Position;
import com.iotek.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionDao positionDao;
    @Override
    public boolean addPosition(Position position) {
        return positionDao.addPosition(position);
    }

    @Override
    public boolean updatePosition(Position position) {
        return positionDao.updatePosition(position);
    }

    @Override
    public boolean deletePosition(Position position) {
        return positionDao.deletePosition(position);
    }

    @Override
    public List<Position> queryAllPosition() {
        return positionDao.queryAllPosition();
    }

    @Override
    public Position queryPosition(Position position) {
        return positionDao.queryPosition(position);
    }
}
