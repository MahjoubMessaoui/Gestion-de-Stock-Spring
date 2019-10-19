package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.IClient;
import com.whitecape.gestionstockmvc.entites.Client;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class ClientServImpl implements IClient {

    private IClient dao;

    public void setDao(IClient dao) {
        this.dao = dao;
    }

    @Override
    public Client save(Client entity) {
        return dao.save(entity);
    }

    @Override
    public Client update(Client entity) {
        return dao.update(entity);
    }

    @Override
    public List < Client > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < Client > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public Client getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
           dao.remove(id);
    }

    @Override
    public Client findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public Client findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
