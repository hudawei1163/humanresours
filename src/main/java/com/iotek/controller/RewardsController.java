package com.iotek.controller;

import com.iotek.service.RewardsService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/10/22.
 */
@Controller
public class RewardsController {
    @Resource
    private RewardsService rewardsService;
}
