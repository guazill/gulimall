package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zxw
 * @email zxw1246329657@gmail.com
 * @date 2023-03-16 11:12:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
