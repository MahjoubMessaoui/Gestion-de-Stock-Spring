package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.CommandeFournisseur;

import java.util.List;

public interface ICommandeFournisseurService {

    public CommandeFournisseur save(CommandeFournisseur entity);
    public CommandeFournisseur update(CommandeFournisseur entity);
    public List <CommandeFournisseur> selectAll();
    public List <CommandeFournisseur> selectAll(String sortfield , String sort);
    public CommandeFournisseur  getById(Long id);
    public void remove(Long id);
    public CommandeFournisseur findOne(String paramName, Object paramValue);
    public CommandeFournisseur findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
