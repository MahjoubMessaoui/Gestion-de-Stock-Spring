package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategory extends JpaRepository<Long , Category > {
}
