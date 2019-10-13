package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Article implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long idArticle;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaire;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTTC;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    public Category category;


    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public BigDecimal getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
    }

    public BigDecimal getPrixUnitaireTTC() {
        return prixUnitaireTTC;
    }

    public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
        this.prixUnitaireTTC = prixUnitaireTTC;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory( Category category) {
        this.category = category;
    }

    public Article(String codeArticle, String designation, BigDecimal prixUnitaire, BigDecimal tauxTva, BigDecimal prixUnitaireTTC, String photo, Category category) {
        this.codeArticle = codeArticle;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.tauxTva = tauxTva;
        this.prixUnitaireTTC = prixUnitaireTTC;
        this.photo = photo;
        this.category = category;
    }

    public Article() {
    }
}
