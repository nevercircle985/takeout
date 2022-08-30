package com.ljj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljj.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
