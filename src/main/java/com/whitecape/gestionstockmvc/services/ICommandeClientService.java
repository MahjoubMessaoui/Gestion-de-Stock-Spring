package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.CommandeClient;

import java.util.List;

public interface ICommandeClientService {

    public CommandeClient save(CommandeClient entity);
    public CommandeClient update(CommandeClient entity);
    public List <CommandeClient> selectAll();
    public List<CommandeClient> selectAll(String sortfield , String sort);
    public CommandeClient  getById(Long id);
    public void remove(Long id);
    public CommandeClient findOne(String paramName, Object paramValue);
    public CommandeClient findOne(String [] paramName, Object [] paramValue);
    public int findCountBy(String paramName, String paramValue);
}
