package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class MovtStock implements Serializable {
    public static final int ENTREE=1;
    private static final int SORTIE=2;
@Id
@GeneratedValue


    private Long idMouvStock;

    @Temporal(TemporalType.TIMESTAMP)
    private Date datMovSto;
    private BigDecimal quantite;
    private int typeMovSto;
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    public Long getIdMouvStock() {
        return idMouvStock;
    }

    public void setIdMouvStock(Long idMouvStock) {
        this.idMouvStock = idMouvStock;
    }

    public Date getDatMovSto() {
        return datMovSto;
    }

    public void setDatMovSto(Date datMovSto) {
        this.datMovSto = datMovSto;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public int getTypeMovSto() {
        return typeMovSto;
    }

    public void setTypeMovSto(int typeMovSto) {
        this.typeMovSto = typeMovSto;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public MovtStock(Long idMouvStock, Date datMovSto, BigDecimal quantite, int typeMovSto, Article article) {
        this.idMouvStock = idMouvStock;
        this.datMovSto = datMovSto;
        this.quantite = quantite;
        this.typeMovSto = typeMovSto;
        this.article = article;
    }

    public MovtStock() {
    }
}
