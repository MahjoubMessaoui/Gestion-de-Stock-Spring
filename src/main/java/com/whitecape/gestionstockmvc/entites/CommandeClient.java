package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class CommandeClient implements Serializable {
    @Id
    @GeneratedValue
    private Long idCommandClient;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

    public Long getIdCommandClient() {
        return idCommandClient;
    }

    public void setIdCommandClient(Long idCommandClient) {
        this.idCommandClient = idCommandClient;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List < LigneCommandeClient > getLigneCommandeClients() {
        return ligneCommandeClients;
    }

    public void setLigneCommandeClients(List < LigneCommandeClient > ligneCommandeClients) {
        this.ligneCommandeClients = ligneCommandeClients;
    }

    public CommandeClient(String code, Date dateCommande, Client client, List < LigneCommandeClient > ligneCommandeClients) {
        this.code = code;
        this.dateCommande = dateCommande;
        this.client = client;
        this.ligneCommandeClients = ligneCommandeClients;
    }

    public CommandeClient() {
    }
}
