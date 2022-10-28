package com.clientes.clientes.model;

import javax.persistence.*;

@Entity
@Table(name="formatoTh")
public class FormatoTh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idbeneficio;

    @Column(name= "beneficio", nullable = true, length = 20)
    private String beneficio;

    public Integer getIdbeneficio() {
        return idbeneficio;
    }

    public void setIdbeneficio(Integer idbeneficio) {
        this.idbeneficio = idbeneficio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
}
