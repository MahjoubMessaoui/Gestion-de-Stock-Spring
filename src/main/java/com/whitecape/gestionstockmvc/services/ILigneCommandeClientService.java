package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.LigneCommandeClient;

import java.util.List;

public interface ILigneCommandeClientService {

    public LigneCommandeClient save(LigneCommandeClient entity);
    public LigneCommandeClient update(LigneCommandeClient entity);
    public List <LigneCommandeClient> selectAll();
    public List<LigneCommandeClient> selectAll(String sortfield , String sort);
    public LigneCommandeClient  getById(Long id);
    public void remove(Long id);
    public LigneCommandeClient findOne(String paramName, Object paramValue);
    public LigneCommandeClient findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
