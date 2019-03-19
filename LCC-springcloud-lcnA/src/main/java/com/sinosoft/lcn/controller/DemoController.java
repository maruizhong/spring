package com.sinosoft.lcn.controller;

import com.sinosoft.lcn.entity.Test;
import com.sinosoft.lcn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;


    @RequestMapping("/list")
    @ResponseBody
    public List<Test> list(){
        return demoService.list();
    }


    @RequestMapping("/save")
    @ResponseBody
    public int save(){
        return demoService.save();
    }
}
