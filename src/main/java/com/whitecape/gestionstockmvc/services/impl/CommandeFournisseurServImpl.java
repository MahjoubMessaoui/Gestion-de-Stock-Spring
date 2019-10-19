package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.ICommandeFournisseur;
import com.whitecape.gestionstockmvc.entites.CommandeFournisseur;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class CommandeFournisseurServImpl implements ICommandeFournisseur {

    private ICommandeFournisseur  dao;
    @Override
    public CommandeFournisseur save(CommandeFournisseur entity) {
        return dao.save(entity);
    }

    @Override
    public CommandeFournisseur update(CommandeFournisseur entity) {
        return dao.update(entity);
    }

    @Override
    public List < CommandeFournisseur > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < CommandeFournisseur > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public CommandeFournisseur getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
            dao.remove(id);
    }

    @Override
    public CommandeFournisseur findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public CommandeFournisseur findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
