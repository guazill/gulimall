package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zxw
 * @email zxw1246329657@gmail.com
 * @date 2023-03-16 15:04:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
