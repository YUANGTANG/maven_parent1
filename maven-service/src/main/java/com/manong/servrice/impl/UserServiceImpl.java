package com.manong.servrice.impl;

import com.manong.entity.User;
import com.manong.dao.UserMapper;
import com.manong.servrice.UserService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    public List<User> findUserLIst() {
        return userMapper.findUserLIst();
    }
}
