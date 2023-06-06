package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {




    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        //1 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);


        //2 组装成父子的树形结构
        entities.stream().filter(categoryEntity->
           categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildrens(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1, menu2)->{
            return  menu1.getSort() - menu2.getSort();
        }).collect(Collectors.toList());

        return entities;
    }


    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> childrens = all.stream().filter((categoryEntity ->
                root.getCatId() == categoryEntity.getParentCid()
        )).map(categoryEntity -> {
            categoryEntity.setChildrens(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0: menu1.getSort()) - (menu2.getSort() == null ? 0: menu2.getSort());
        }).collect(Collectors.toList());

        return childrens;
    }

}