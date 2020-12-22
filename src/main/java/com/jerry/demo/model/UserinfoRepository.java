package com.jerry.demo.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Jerry
 * @date 2020/12/22
 */
public interface UserinfoRepository extends CrudRepository<Userinfo,Long> {
    
//    @Modifying
//    @Query(value="insert into userinfo (id,username) values(?1,?2)",nativeQuery=true)
//    int addUserinfo(int id,String userName);
    
    Userinfo findUserinfoById(int id);
}
