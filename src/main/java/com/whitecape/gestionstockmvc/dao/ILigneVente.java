package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILigneVente extends JpaRepository<Long, LigneVente > {
}
