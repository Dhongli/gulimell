package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author daihongli
 * @email 1215765236@qq.com
 * @date 2020-04-20 22:40:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
