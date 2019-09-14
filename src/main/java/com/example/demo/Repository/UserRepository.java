package com.example.demo.Repository;

import com.example.demo.DO.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ZhengKai
 * @data 2019-08-23 17:55
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    long deleteById(long id);

}
