package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

    public Utilisateur save(Utilisateur entity);
    public Utilisateur update(Utilisateur entity);
    public List <Utilisateur> selectAll();
    public List<Utilisateur> selectAll(String sortfield , String sort);
    public Utilisateur  getById(Long id);
    public void remove(Long id);
    public Utilisateur findOne(String paramName, Object paramValue);
    public Utilisateur findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
