package com.whitecape.gestionstockmvc.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Client implements Serializable {
          @Id
          @GeneratedValue
             private Long idClient;
             private String nom;
             private String prenom;
             private String adresse;
             private String photo;
             private String mail;

    public List < CommandeClient > getCommandeClients() {
        return commandeClients;
    }

    public void setCommandeClients(List < CommandeClient > commandeClients) {
        this.commandeClients = commandeClients;
    }

    @OneToMany(mappedBy = "client")
             private List <CommandeClient> commandeClients;
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Client() {
    }

    public Client(String nom, String prenom, String adresse, String photo, String mail, List < CommandeClient > commandeClients) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.photo = photo;
        this.mail = mail;
        this.commandeClients = commandeClients;
    }

}
