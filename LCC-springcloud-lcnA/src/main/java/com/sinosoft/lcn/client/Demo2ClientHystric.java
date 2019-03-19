package com.sinosoft.lcn.client;

import com.sinosoft.lcn.entity.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@Component
public class Demo2ClientHystric implements Demo2Client {
    private Logger logger = LoggerFactory.getLogger(Demo2ClientHystric.class);


    @Override
    public List<Test> list() {
        logger.info("进入断路器-list。。。");
        throw new RuntimeException("list 保存失败.");
    }

    @Override
    public int save() {
        logger.info("进入断路器-save。。。");
        throw new RuntimeException("save 保存失败.");
    }
}
