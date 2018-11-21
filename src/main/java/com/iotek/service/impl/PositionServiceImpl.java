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
        if(position==null){
            return false;
        }
        List<Position> positions = positionDao.queryAllPosition();
        for (Position p:positions) {
            if (position.getP_name().equals(p.getP_name())){
                return false;
            }
        }
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
    public Position queryPosition(String p_name) {
        return positionDao.queryPosition(p_name);
    }

    @Override
    public Position queryPositionById(int p_id) {
        return positionDao.queryPositionById(p_id);
    }

    @Override
    public List<Position> queryAllPositionByDid(int d_id) {
        return positionDao.queryAllPositionByDid(d_id);
    }
}
