package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class LigneCommandeClient implements Serializable {
    @Id
    @GeneratedValue
     private Long idLigCommCli;

   @ManyToOne
   @JoinColumn(name = "idCommandClient")
    private CommandeClient commandeClient;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    public Long getIdLigCommCli() {
        return idLigCommCli;
    }

    public void setIdLigCommCli(Long idLigCommCli) {
        this.idLigCommCli = idLigCommCli;
    }

    public CommandeClient getCommandeClient() {
        return commandeClient;
    }

    public void setCommandeClient(CommandeClient commandeClient) {
        this.commandeClient = commandeClient;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public LigneCommandeClient(CommandeClient commandeClient, Article article) {
        this.commandeClient = commandeClient;
        this.article = article;
    }

    public LigneCommandeClient() {
    }
}
