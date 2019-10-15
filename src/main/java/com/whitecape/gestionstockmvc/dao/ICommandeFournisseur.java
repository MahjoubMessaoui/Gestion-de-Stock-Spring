package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommandeFournisseur extends JpaRepository<Long, CommandeFournisseur > {
}
