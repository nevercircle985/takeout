package com.ljj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljj.entity.DishFlavor;
import com.ljj.mapper.DishFlavorMapper;
import com.ljj.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
