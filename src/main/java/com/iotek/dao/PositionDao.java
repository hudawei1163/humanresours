package com.iotek.dao;

import com.iotek.model.Position;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface PositionDao {
    boolean addPosition(Position position);
    boolean updatePosition(Position position);
    boolean deletePosition(Position position);
    List<Position> queryAllPosition();
    Position queryPosition(Position position);
}