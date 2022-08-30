package com.ljj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljj.entity.OrderDetail;
import com.ljj.mapper.OrderDetailMapper;
import com.ljj.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}