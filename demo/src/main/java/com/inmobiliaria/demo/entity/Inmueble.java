package com.inmobiliaria.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="local")
public class Inmueble {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String estado;
    
    private String precio;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Oficina oficina;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Propietario propietario;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Villa villa;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Pisos pisos;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Casas casas;
    
    @OneToOne(mappedBy = "inmueble")
    private Visita visita;
}
