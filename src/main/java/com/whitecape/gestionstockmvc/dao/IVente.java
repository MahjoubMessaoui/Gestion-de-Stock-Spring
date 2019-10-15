package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVente extends JpaRepository<Long, Vente > {
}
