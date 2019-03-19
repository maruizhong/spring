package com.sinosoft.lcn.client;

import com.sinosoft.lcn.entity.Test;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@Component
public class Demo2ClientHystric implements Demo2Client {


    @Override
    public List<Test> list() {
        System.out.println("进入断路器-list。。。");
        throw new RuntimeException("list 保存失败.");
    }

    @Override
    public int save() {
        System.out.println("进入断路器-save。。。");
        throw new RuntimeException("save 保存失败.");
    }
}
