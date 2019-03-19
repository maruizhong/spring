package com.sinosoft.lcn.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.sinosoft.lcn.client.Demo2Client;
import com.sinosoft.lcn.dao.TestMapper;
import com.sinosoft.lcn.entity.Test;
import com.sinosoft.lcn.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    private Demo2Client demo2Client;


    @Autowired
    private TestMapper testMapper;

    private Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public List<Test> list() {
        return testMapper.findAll();
    }

    @Override
    @TxTransaction(isStart = true)
    @Transactional
    public int save() {

        int rs1 = testMapper.save("hello-A");

        int rs2 = demo2Client.save();

       //int v = 100/0;

        return rs1+rs2;
    }
}
