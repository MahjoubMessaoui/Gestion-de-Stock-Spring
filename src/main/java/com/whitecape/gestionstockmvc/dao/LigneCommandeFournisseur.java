package com.whitecape.gestionstockmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeFournisseur extends JpaRepository<Long, LigneCommandeFournisseur> {
}
