package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFournisseur extends JpaRepository<Long , Fournisseur > {
}
