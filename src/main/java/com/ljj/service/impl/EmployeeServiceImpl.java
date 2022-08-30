package com.ljj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljj.mapper.EmployeeMapper;
import com.ljj.entity.Employee;
import org.springframework.stereotype.Service;
import com.ljj.service.EmployeeService;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
