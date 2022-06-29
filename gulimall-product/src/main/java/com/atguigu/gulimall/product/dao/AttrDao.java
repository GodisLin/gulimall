package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author linpengxi
 * @email linpxneu@163.com
 * @date 2022-06-29 09:59:19
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
