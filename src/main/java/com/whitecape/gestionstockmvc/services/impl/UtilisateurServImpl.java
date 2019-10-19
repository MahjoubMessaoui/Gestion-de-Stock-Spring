package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.IUtilisateur;
import com.whitecape.gestionstockmvc.entites.Utilisateur;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class UtilisateurServImpl implements IUtilisateur {

    private IUtilisateur dao;
    @Override
    public Utilisateur save(Utilisateur entity) {
        return dao.save(entity);
    }

    @Override
    public Utilisateur update(Utilisateur entity) {
        return dao.update(entity);
    }

    @Override
    public List < Utilisateur > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < Utilisateur > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public Utilisateur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
          dao.remove(id);
    }

    @Override
    public Utilisateur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public Utilisateur findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
