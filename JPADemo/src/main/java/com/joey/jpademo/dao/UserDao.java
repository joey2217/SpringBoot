package com.joey.jpademo.dao;

import com.joey.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Joey
 * @date 2018-06-19 16:28
 * @desc UserJPA
 **/
public interface UserDao extends JpaRepository<User, Long>,JpaSpecificationExecutor<User>,Serializable {
    /**
     * @param id
     * @return
     */
    User findUserById(long id);


}
