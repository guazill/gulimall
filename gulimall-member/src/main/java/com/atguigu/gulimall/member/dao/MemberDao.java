package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zxw
 * @email zxw1246329657@gmail.com
 * @date 2023-03-16 14:35:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
