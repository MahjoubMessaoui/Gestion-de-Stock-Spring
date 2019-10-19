package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.ICategory;
import com.whitecape.gestionstockmvc.entites.Category;
import com.whitecape.gestionstockmvc.services.ICategoryService;

import java.util.List;

public class CategorySerImpl implements ICategoryService {

    private ICategory dao;

    public void setDao(ICategory dao) {
        this.dao = dao;
    }

    @Override
    public Category savCategory(Category Categoryntity) {
        return dao.save(Categoryntity);
    }

    @Override
    public Category updatCategory(Category Categoryntity) {
        return dao.update(Categoryntity);
    }

    @Override
    public List < Category > sCategorylCategoryctAll() {
        return dao.selectAll();
    }

    @Override
    public List < Category > sCategorylCategoryctAll(String sortfiCategoryld, String sort) {
        return dao.selectAll(sortfiCategoryld,sort);
    }

    @Override
    public Category gCategorytById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void rCategorymovCategory(Long id) {
             dao.remove(id);
    }

    @Override
    public Category findOnCategory(String paramNamCategory, Object paramValuCategory) {
        return dao.findOne(paramNamCategory,paramValuCategory);
    }

    @Override
    public Category findOnCategory(String[] paramNamCategory, Object[] paramValuCategory) {
        return dao.findOne(paramNamCategory,paramValuCategory);
    }

    @Override
    public int findCountBy(String paramNamCategory, String paramValuCategory) {
        return dao.findCountBy(paramNamCategory,paramValuCategory);
    }
}
