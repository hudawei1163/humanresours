package com.iotek.service;

import com.iotek.model.Position;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface PositionService {
    boolean addPosition(Position position);
    boolean updatePosition(Position position);
    boolean deletePosition(Position position);
    List<Position> queryAllPosition();
    Position queryPosition(String p_name);
    Position queryPositionById(int p_id);
    List<Position> queryAllPositionByDid(int d_id);
}
