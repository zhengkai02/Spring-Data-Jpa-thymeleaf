package com.example.demo.Service;

import com.example.demo.DO.User;

import java.util.List;

/**
 * @author ZhengKai
 * @data 2019-08-25 18:00
 */
public interface UserService {
    /**
     * 根据用户id查询用户
     */
    public User findUserById(long id);
    /**
     * 保存用户信息
     */
    public void save(User user);
    /**
     * 根据用户id删除用户
     */
    public void deleteById(long id);
    /**
     * 获取所有用户列表
     */
    public List<User> getUserList();
    /**
     *修改用户信息
     */
    public void edit(User user);
}
