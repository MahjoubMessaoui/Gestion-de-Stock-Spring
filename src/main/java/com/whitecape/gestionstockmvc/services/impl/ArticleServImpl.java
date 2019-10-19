package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.IArticleDao;
import com.whitecape.gestionstockmvc.entites.Article;
import com.whitecape.gestionstockmvc.services.IArticleService;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class ArticleServImpl implements IArticleService {

    private IArticleDao dao;


    public void setDao(IArticleDao dao) {
        this.dao = dao;
    }

    @Override
    public Article savArticle(Article Articlentity) {
        return dao.save(Articlentity);
    }

    @Override
    public Article updatArticle(Article Articlentity) {
        return dao.update(Articlentity);
    }

    @Override
    public List < Article > sArticlelArticlectAll() {
        return dao.selectAll();
    }

    @Override
    public List < Article > sArticlelArticlectAll(String sortfiArticleld, String sort) {
        return dao.selectAll(sortfiArticleld,sort);
    }

    @Override
    public Article gArticletById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void rArticlemovArticle(Long id) {
      dao.remove(id);
    }

    @Override
    public Article findOnArticle(String paramNamArticle, Object paramValuArticle) {
        return dao.findOne(paramNamArticle,paramValuArticle);
    }

    @Override
    public Article findOnArticle(String[] paramNamArticle, Object[] paramValuArticle) {
        return dao.findOne(paramNamArticle,paramValuArticle);
    }

    @Override
    public int findCountBy(String paramNamArticle, String paramValuArticle) {
        return dao.findCountBy(paramNamArticle,paramValuArticle);
    }
}
