package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.Category;

import java.util.List;

public interface ICategoryService {

    public Category savCategory(Category Categoryntity);
    public Category updatCategory(Category Categoryntity);
    public List <Category> sCategorylCategoryctAll();
    public List<Category> sCategorylCategoryctAll(String sortfiCategoryld , String sort);
    public Category  gCategorytById(Long id);
    public void rCategorymovCategory(Long id);
    public Category findOnCategory(String paramNamCategory, Object paramValuCategory);
    public Category findOnCategory(String [] paramNamCategory, Object [] paramValuCategory);
    public int findCountBy(String paramNamCategory, String paramValuCategory);
}
