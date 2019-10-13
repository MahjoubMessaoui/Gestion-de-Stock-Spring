package com.whitecape.gestionstockmvc.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Fournisseur implements Serializable {
   @Id
   @GeneratedValue

    private Long idFournisseur;
    private String nom;
    private String prenom;
    private String adresse;
    private String photo;
    private String mail;

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
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

    public Fournisseur() {
    }

    public Fournisseur(String nom, String prenom, String adresse, String photo, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.photo = photo;
        this.mail = mail;
    }
}
