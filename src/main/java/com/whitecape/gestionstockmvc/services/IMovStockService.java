package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.MovtStock;

import java.util.List;

public interface IMovStockService {

    public MovtStock save(MovtStock entity);
    public MovtStock update(MovtStock entity);
    public List <MovtStock> selectAll();
    public List <MovtStock> selectAll(String sortfield , String sort);
    public MovtStock  getById(Long id);
    public void remove(Long id);
    public MovtStock findOne(String paramName, Object paramValue);
    public MovtStock findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
