package com.sinosoft.lcn.service;



import com.sinosoft.lcn.entity.Test;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
public interface DemoService {

    List<Test> list();

    int save();

}
