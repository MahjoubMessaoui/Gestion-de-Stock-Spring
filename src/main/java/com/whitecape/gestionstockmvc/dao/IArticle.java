package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticle extends JpaRepository<Long, Article > {
}
