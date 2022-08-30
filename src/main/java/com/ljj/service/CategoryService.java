package com.ljj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
