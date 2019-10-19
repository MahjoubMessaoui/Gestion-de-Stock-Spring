package com.whitecape.gestionstockmvc.services.impl;

import com.whitecape.gestionstockmvc.dao.IMovtStock;
import com.whitecape.gestionstockmvc.entites.MovtStock;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class MovtStockServImpl implements IMovtStock {

    private IMovtStock dao;

    public void setDao(IMovtStock dao) {
        this.dao = dao;
    }

    @Override
    public MovtStock save(MovtStock entity) {
        return dao.save(entity);
    }

    @Override
    public MovtStock update(MovtStock entity) {
        return dao.update(entity);
    }

    @Override
    public List < MovtStock > selectAll() {
        return dao.selectAll();
    }

    @Override
    public List < MovtStock > selectAll(String sortfield, String sort) {
        return dao.selectAll(sortfield,sort);
    }

    @Override
    public MovtStock getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void remove(Long id) {
         dao.remove(id);
    }

    @Override
    public MovtStock findOne(String paramName, Object paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public MovtStock findOne(String[] paramName, Object[] paramValue) {
        return dao.findOne(paramName,paramValue);
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        return dao.findCountBy(paramName,paramValue);
    }
}
