package com.whitecape.gestionstockmvc.dao;

import com.whitecape.gestionstockmvc.entites.MovtStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovtStock extends JpaRepository<Long, MovtStock > {
}
