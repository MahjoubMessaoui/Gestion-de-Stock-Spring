package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.LigneVente;

import java.util.List;

public interface ILigneVenteService {

    public LigneVente save(LigneVente entity);
    public LigneVente update(LigneVente entity);
    public List <LigneVente> selectAll();
    public List < LigneVente > selectAll(String sortfield , String sort);
    public LigneVente  getById(Long id);
    public void remove(Long id);
    public LigneVente findOne(String paramName, Object paramValue);
    public LigneVente findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
