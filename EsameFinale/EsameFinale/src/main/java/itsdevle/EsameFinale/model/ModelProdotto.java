package itsdevle.EsameFinale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ModelProdotto {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private int quantita;
    private Date datadiacquisto;
    private Date datadiscadenza;
    private float prezzo;

    public ModelProdotto(){}

    public ModelProdotto(String nome, int quantita, Date dataDiAcquisto, Date dataDiScadenza, float prezzo) {
        this.nome = nome;
        this.quantita = quantita;
        this.datadiacquisto = dataDiAcquisto;
        this.datadiscadenza = dataDiScadenza;
        this.prezzo = prezzo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Date getDatadiacquisto() {
        return datadiacquisto;
    }

    public void setDatadiacquisto(Date datadiacquisto) {
        this.datadiacquisto = datadiacquisto;
    }

    public Date getDatadiscadenza() {
        return datadiscadenza;
    }

    public void setDatadiscadenza(Date datadiscadenza) {
        this.datadiscadenza = datadiscadenza;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
