package com.sinosoft.elastic.controller;

/**
 * Created by maruizhong on 2019/3/14.
 */

import java.util.List;

import com.sinosoft.elastic.dao.UserDao;
import com.sinosoft.elastic.pojo.User;
import com.sinosoft.elastic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserRestController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public boolean createUser(@RequestBody User user) {
        return userService.insert(user);
    }


    @GetMapping("/user/searchContent")
    public List<User> search(@RequestParam(value = "searchContent") String searchContent) {
        return userService.search(searchContent);
    }

   @GetMapping("/user")
    public List<User> searchUser(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {
        return userService.searchUser(pageNumber, pageSize, searchContent);
    }


/*    @GetMapping("/user2")
    public List<User> searchUserByWeight(@RequestParam(value = "searchContent") String searchContent) {
        return userService.searchUserByWeight(searchContent);
    }*/
    //http://localhost:7070/delete?id=1525415333329

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "deleteByName") String name){

        return userService.delete(name);
    }


}