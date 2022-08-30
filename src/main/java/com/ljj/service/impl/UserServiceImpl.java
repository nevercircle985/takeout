package com.ljj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljj.entity.User;
import com.ljj.mapper.UserMapper;
import com.ljj.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
