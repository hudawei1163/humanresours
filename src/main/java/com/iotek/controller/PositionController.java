package com.iotek.controller;

import com.iotek.service.PositionService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/10/22.
 */
//职位
@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
}
