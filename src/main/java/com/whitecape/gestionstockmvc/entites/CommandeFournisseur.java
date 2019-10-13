package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class CommandeFournisseur implements Serializable {
 @Id
 @GeneratedValue
          private Long idCommandeFournisseur;
           private String code;
        @Temporal(TemporalType.TIMESTAMP)
          private Date dateCommande;


      @ManyToOne
      @JoinColumn(name = "idFournisseur")
     private Fournisseur fournisseur;


      @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur>ligneCommandeFournisseurs;

    public Long getIdCommandeFournisseur() {
        return idCommandeFournisseur;
    }

    public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
        this.idCommandeFournisseur = idCommandeFournisseur;
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

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List < LigneCommandeFournisseur > getLigneCommandeFournisseurs() {
        return ligneCommandeFournisseurs;
    }

    public void setLigneCommandeFournisseurs(List < LigneCommandeFournisseur > ligneCommandeFournisseurs) {
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }

    public CommandeFournisseur(String code, Date dateCommande, Fournisseur fournisseur, List < LigneCommandeFournisseur > ligneCommandeFournisseurs) {
        this.code = code;
        this.dateCommande = dateCommande;
        this.fournisseur = fournisseur;
        this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
    }

    public CommandeFournisseur() {
    }

}
