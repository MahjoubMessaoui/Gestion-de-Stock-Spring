package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.ILigneCommandeFournisseur;
import com.whitecape.gestionstockmvc.entites.LigneCommandeFournisseur;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class LigneCommandeFournisseurSerImpl implements ILigneCommandeFournisseur {

    private ILigneCommandeFournisseur dao;

    public void setDao(ILigneCommandeFournisseur dao) {
        this.dao = dao;
    }

    @Override
    public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
        return dao.save(entity);
    }

    @Override
    public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
        return dao.update(entity);
    }

    @Override
    public List < LigneCommandeFournisseur > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < LigneCommandeFournisseur > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public LigneCommandeFournisseur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
          dao.remove(id);
    }

    @Override
    public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public LigneCommandeFournisseur findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
