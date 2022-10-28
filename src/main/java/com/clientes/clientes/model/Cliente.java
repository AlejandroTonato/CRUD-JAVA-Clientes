package com.clientes.clientes.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @NotNull(message = "Not Null")
    @NotBlank(message = "El nombre es Obligatorio")
    @Size(min=3 ,max=70,message = "El nombre debe ser < a 3 y < 70 Caracteres")
    @Column(name= "nombres", nullable = false, length = 70)
    private String nombre;
    @NotNull(message = "Not Null")
    @NotBlank(message = "El email es Obligatorio")
    @Size (min=10 ,max=150,message = "El email debe ser < 10 y > 150 Caracteres")
    @Email(message = "El email no es valido")
    @Column(name= "email", nullable = false, length = 150)
    private String email;
    @Size (min=8,message = "El telefono debe debe tener al menos 8 Caracteres")
    @Column(name= "telefono", nullable = true, length = 10)
    private String telefono;
    @Size (min=2,message = "El telefono debe debe tener al menos 8 Caracteres")
    @Column(name= "grupo", nullable = true, length = 10)
    private String grupo;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
