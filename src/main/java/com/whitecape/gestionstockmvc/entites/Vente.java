package com.whitecape.gestionstockmvc.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
public class Vente implements Serializable {
    @Id
   @GeneratedValue
     private Long idVente;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVente;



    @OneToMany(mappedBy = "vente")
    public List<LigneVente> ligneVentes;

    public Long getIdVente() {
        return idVente;
    }

    public void setIdVente(Long idVente) {
        this.idVente = idVente;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public List < LigneVente > getLigneVentes() {
        return ligneVentes;
    }

    public void setLigneVentes(List < LigneVente > ligneVentes) {
        this.ligneVentes = ligneVentes;
    }

    public Vente(String code, Date dateVente, List < LigneVente > ligneVentes) {
        this.code = code;
        this.dateVente = dateVente;
        this.ligneVentes = ligneVentes;
    }

    public Vente() {
    }
}
