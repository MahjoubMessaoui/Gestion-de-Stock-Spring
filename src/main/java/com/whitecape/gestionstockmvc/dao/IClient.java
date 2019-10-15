package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClient extends JpaRepository<Long, Client > {
}
