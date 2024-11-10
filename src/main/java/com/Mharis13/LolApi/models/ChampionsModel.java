package com.Mharis13.LolApi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "champions")
public class ChampionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "region", length = 255)
    private String region;

    @Column(name = "rol", length = 255)
    private String rol;

    @Column(name = "tipo", length = 20)
    private String tipo;

    @Column(name = "champion_icon", length = 255)
    private String championIcon;

    @Column(name = "pasiva_icon", length = 200)
    private String pasivaIcon;

    @Column(name = "q_icon", length = 255)
    private String qIcon;

    @Column(name = "w_icon", length = 255)
    private String wIcon;

    @Column(name = "e_icon", length = 255)
    private String eIcon;

    @Column(name = "r_icon", length = 255)
    private String rIcon;

    @Column(name = "pasiva_desc")
    private String pasivaDesc;

    @Column(name = "q_desc")
    private String qDesc;

    @Column(name = "w_desc")
    private String wDesc;

    @Column(name = "e_desc")
    private String eDesc;

    @Column(name = "r_desc")
    private String rDesc;

    // ?Getters and setters
    public String getChampionIcon() {
        return championIcon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasivaDesc() {
        return pasivaDesc;
    }

    public String getPasivaIcon() {
        return pasivaIcon;
    }

    public String getRegion() {
        return region;
    }

    public String getRol() {
        return rol;
    }

    public String getTipo() {
        return tipo;
    }

    public String geteDesc() {
        return eDesc;
    }

    public String geteIcon() {
        return eIcon;
    }

    public String getqDesc() {
        return qDesc;
    }

    public String getqIcon() {
        return qIcon;
    }

    public String getrDesc() {
        return rDesc;
    }

    public String getrIcon() {
        return rIcon;
    }

    public String getwDesc() {
        return wDesc;
    }

    public String getwIcon() {
        return wIcon;
    }

}