package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUtilisateur extends JpaRepository<Long, Utilisateur > {
}
