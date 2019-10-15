package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILigneCommandeClient extends JpaRepository<Long, LigneCommandeClient > {
}
