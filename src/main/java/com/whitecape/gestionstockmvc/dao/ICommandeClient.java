package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommandeClient extends JpaRepository<Long, CommandeClient > {
}
