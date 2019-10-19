package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.Vente;

import java.util.List;

public interface IVenteService {

    public Vente save(Vente entity);
    public Vente update(Vente entity);
    public List <Vente> selectAll();
    public List <Vente> selectAll(String sortfield , String sort);
    public Vente  getById(Long id);
    public void remove(Long id);
    public Vente findOne(String paramName, Object paramValue);
    public Vente findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
