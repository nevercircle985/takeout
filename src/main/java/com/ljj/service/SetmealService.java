package com.ljj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljj.dto.SetmealDto;
import com.ljj.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);
    public void removeWithDish(List<Long> ids);
    public SetmealDto getSetmealData(Long id);
}
