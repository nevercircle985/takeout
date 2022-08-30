package com.ljj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljj.entity.ShoppingCart;
import com.ljj.mapper.ShoppingCartMapper;
import com.ljj.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
