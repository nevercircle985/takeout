package com.ljj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljj.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
