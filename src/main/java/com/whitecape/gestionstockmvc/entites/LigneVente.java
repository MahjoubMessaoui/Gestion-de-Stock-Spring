package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class LigneVente implements Serializable {
        @Id
        @GeneratedValue
          private Long idLigneVente;


    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "vente")
    private Vente vente;

    public Long getIdLigneVente() {
        return idLigneVente;
    }

    public void setIdLigneVente(Long idLigneVente) {
        this.idLigneVente = idLigneVente;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public LigneVente(Article article, Vente vente) {
        this.article = article;
        this.vente = vente;
    }

    public LigneVente() {
    }
}
