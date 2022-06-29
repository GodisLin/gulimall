package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author linpengxi
 * @email linpxneu@163.com
 * @date 2022-06-29 13:53:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
