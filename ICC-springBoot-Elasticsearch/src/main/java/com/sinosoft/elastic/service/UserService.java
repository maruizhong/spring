package com.sinosoft.elastic.service;

/**
 * Created by maruizhong on 2019/3/14.
 */

import com.sinosoft.elastic.pojo.User;

import java.util.List;



public interface UserService {

    /**
     * 新增用户信息
     *
     * @param user
     * @return
     */
    boolean insert(User user);

    /**
     * 根据关键字进行全文搜索
     * @param searchContent
     * @return
     */
    List<User> search(String searchContent);

    /**
     * 根据关键字进行搜索并分页
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    List<User> searchUser(Integer pageNumber, Integer pageSize, String searchContent);

/*
    */
/**
     * 根据关键词权重进行查询
     * @param
     * @return
     *//*

    List<User> searchUserByWeight(String searchContent);

*/

    String delete(String name);
}
