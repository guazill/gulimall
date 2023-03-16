package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author zxw
 * @email zxw1246329657@gmail.com
 * @date 2023-03-16 01:23:24
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {

    void findAll();
	
}
