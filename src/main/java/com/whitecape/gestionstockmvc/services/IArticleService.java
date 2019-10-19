package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.Article;

import java.util.List;

public interface IArticleService {

    public Article savArticle(Article Articlentity);
    public Article updatArticle(Article Articlentity);
    public List <Article> sArticlelArticlectAll();
    public List <Article> sArticlelArticlectAll(String sortfiArticleld , String sort);
    public Article  gArticletById(Long id);
    public void rArticlemovArticle(Long id);
    public Article findOnArticle(String paramNamArticle, Object paramValuArticle);
    public Article findOnArticle(String [] paramNamArticle, Object [] paramValuArticle);
    public int findCountBy(String paramNamArticle, String paramValuArticle);
}
