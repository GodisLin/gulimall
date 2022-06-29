package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author linpengxi
 * @email linpxneu@163.com
 * @date 2022-06-29 13:08:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
