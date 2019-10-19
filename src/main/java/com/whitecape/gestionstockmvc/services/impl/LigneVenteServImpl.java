package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.ILigneVente;
import com.whitecape.gestionstockmvc.entites.LigneVente;

import java.util.List;

public class LigneVenteServImpl implements ILigneVente {

    private ILigneVente dao;

    public void setDao(ILigneVente dao) {
        this.dao = dao;
    }

    @Override
    public LigneVente save(LigneVente entity) {
        return dao.save(entity);
    }

    @Override
    public LigneVente update(LigneVente entity) {
        return dao.update(entity);
    }

    @Override
    public List < LigneVente > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < LigneVente > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public LigneVente getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
dao.remove(id);
    }

    @Override
    public LigneVente findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public LigneVente findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
