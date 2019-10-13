package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class LigneCommandeFournisseur implements Serializable {
         @Id
         @GeneratedValue
         private Long idLigCommFour;

         @ManyToOne
         @JoinColumn(name = "idCommandeFournisseur")
         private CommandeFournisseur commandeFournisseur;

         @ManyToOne
         @JoinColumn(name = "idArticle")
         private Article article;

    public Long getIdLigCommFour() {
        return idLigCommFour;
    }

    public void setIdLigCommFour(Long idLigCommFour) {
        this.idLigCommFour = idLigCommFour;
    }

    public CommandeFournisseur getCommandeFournisseur() {
        return commandeFournisseur;
    }

    public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        this.commandeFournisseur = commandeFournisseur;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public LigneCommandeFournisseur(CommandeFournisseur commandeFournisseur, Article article) {
        this.commandeFournisseur = commandeFournisseur;
        this.article = article;
    }

    public LigneCommandeFournisseur() {
    }
}
