package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.IVente;
import com.whitecape.gestionstockmvc.entites.Vente;

import java.util.List;

public class VenteServImpl implements IVente {

    private IVente dao;

    public void setDao(IVente dao) {
        this.dao = dao;
    }

    @Override
    public Vente save(Vente entity) {
        return dao.save(entity);
    }

    @Override
    public Vente update(Vente entity) {
        return dao.update(entity);
    }

    @Override
    public List < Vente > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < Vente > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public Vente getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
           dao.remove(id);
    }

    @Override
    public Vente findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public Vente findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
