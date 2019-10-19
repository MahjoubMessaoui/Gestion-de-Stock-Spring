package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    public Fournisseur save(Fournisseur entity);
    public Fournisseur update(Fournisseur entity);
    public List <Fournisseur> selectAll();
    public List <Fournisseur> selectAll(String sortfield , String sort);
    public Fournisseur getById(Long id);
    public void remove(Long id);
    public Fournisseur findOne(String paramName, Object paramValue);
    public Fournisseur findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
