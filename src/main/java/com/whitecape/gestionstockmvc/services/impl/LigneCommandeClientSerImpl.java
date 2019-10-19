package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.ILigneCommandeClient;
import com.whitecape.gestionstockmvc.entites.LigneCommandeClient;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class LigneCommandeClientSerImpl implements ILigneCommandeClient {

    private ILigneCommandeClient dao;

    public void setDao(ILigneCommandeClient dao) {
        this.dao = dao;
    }

    @Override
    public LigneCommandeClient save(LigneCommandeClient entity) {
        return dao.save(entity);
    }

    @Override
    public LigneCommandeClient update(LigneCommandeClient entity) {
        return dao.update(entity);
    }

    @Override
    public List < LigneCommandeClient > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < LigneCommandeClient > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public LigneCommandeClient getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
           dao.remove(id);
    }

    @Override
    public LigneCommandeClient findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public LigneCommandeClient findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
