package com.whitecape.gestionstockmvc.services;

import com.whitecape.gestionstockmvc.entites.Client;

import java.util.List;

public interface IClientService {

    public Client savClient(Client Clientntity);
    public Client updatClient(Client Clientntity);
    public List <Client> sClientlClientctAll();
    public List<Client> sClientlClientctAll(String sortfiClientld , String sort);
    public Client  gClienttById(Long id);
    public void rClientmovClient(Long id);
    public Client findOnClient(String paramNamClient, Object paramValuClient);
    public Client findOnClient(String [] paramNamClient, Object [] paramValuClient);
    public int findCountBy(String paramNamClient, String paramValuClient);
}
