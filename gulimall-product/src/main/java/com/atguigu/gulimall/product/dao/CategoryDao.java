package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author daihongli
 * @email 1215765236@qq.com
 * @date 2020-04-13 22:09:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
