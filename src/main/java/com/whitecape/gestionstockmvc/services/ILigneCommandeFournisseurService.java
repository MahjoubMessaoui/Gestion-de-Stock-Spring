package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.LigneCommandeFournisseur;

import java.util.List;

public interface ILigneCommandeFournisseurService {

    public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
    public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
    public List <LigneCommandeFournisseur> selectAll();
    public List <LigneCommandeFournisseur> selectAll(String sortfield , String sort);
    public LigneCommandeFournisseur  getById(Long id);
    public void remove(Long id);
    public LigneCommandeFournisseur findOne(String paramName, Object paramValue);
    public LigneCommandeFournisseur findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
