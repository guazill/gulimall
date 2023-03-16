package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zxw
 * @email zxw1246329657@gmail.com
 * @date 2023-03-16 01:23:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
