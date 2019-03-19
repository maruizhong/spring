package com.sinosoft.elastic.dao;

/**
 * Created by maruizhong on 2019/3/14.
 */
import com.sinosoft.elastic.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface UserDao extends ElasticsearchRepository<User, Long>{

}
