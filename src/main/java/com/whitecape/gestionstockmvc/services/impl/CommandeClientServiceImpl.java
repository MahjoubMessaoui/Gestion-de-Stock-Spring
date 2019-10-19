package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.ICommandeClient;
import com.whitecape.gestionstockmvc.entites.CommandeClient;

import java.util.List;

public class CommandeClientServiceImpl implements ICommandeClient {

    private ICommandeClient dao;

    public void setDao(ICommandeClient dao) {
        this.dao = dao;
    }

    @Override
    public CommandeClient save(CommandeClient entity) {
        return dao.save(entity);
    }

    @Override
    public CommandeClient update(CommandeClient entity) {
        return dao.update(entity);
    }

    @Override
    public List < CommandeClient > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < CommandeClient > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public CommandeClient getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
            dao.remove(id);
    }

    @Override
    public CommandeClient findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public CommandeClient findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
