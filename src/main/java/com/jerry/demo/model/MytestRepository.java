package com.jerry.demo.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Jerry
 * @date 2020/12/22
 */
public interface MytestRepository extends CrudRepository<Mytest,Long> {
    
//    @Modifying
//    @Query(value="insert into userinfo (id,username) values(?1,?2)",nativeQuery=true)
//    int addUserinfo(int id,String userName);
    
    Mytest findMytestById(int id);
}
