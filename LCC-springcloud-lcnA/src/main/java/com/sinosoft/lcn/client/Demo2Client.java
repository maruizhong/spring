package com.sinosoft.lcn.client;


import com.sinosoft.lcn.entity.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@FeignClient(value = "demoB",fallback = Demo2ClientHystric.class)
public interface Demo2Client {


    @RequestMapping(value = "/demo/list",method = RequestMethod.GET)
    List<Test> list();


    @RequestMapping(value = "/demo/save",method = RequestMethod.GET)
    int save();
}
