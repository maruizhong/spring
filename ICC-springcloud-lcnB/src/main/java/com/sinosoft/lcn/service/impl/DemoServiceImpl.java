package com.sinosoft.lcn.service.impl;

import com.codingapi.tx.annotation.ITxTransaction;

import com.sinosoft.lcn.dao.TestMapper;
import com.sinosoft.lcn.entity.Test;
import com.sinosoft.lcn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@Service
public class DemoServiceImpl implements DemoService,ITxTransaction{

    @Autowired
    private TestMapper testMapper;



    @Override
    public List<Test> list() {
        return testMapper.findAll();
    }


    @Override
    @Transactional
    public int save() {

        int rs = testMapper.save("hello-B");

        return rs;
    }
}
