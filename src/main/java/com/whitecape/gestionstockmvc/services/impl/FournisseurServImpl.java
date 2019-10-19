package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.IFournisseur;
import com.whitecape.gestionstockmvc.entites.Fournisseur;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class FournisseurServImpl implements IFournisseur {

    private IFournisseur dao;
    @Override
    public Fournisseur save(Fournisseur entity) {
        return dao.save(entity);
    }

    @Override
    public Fournisseur update(Fournisseur entity) {
        return dao.update(entity);
    }

    @Override
    public List < Fournisseur > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < Fournisseur > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public Fournisseur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
   dao.remove(id);
    }

    @Override
    public Fournisseur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public Fournisseur findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
