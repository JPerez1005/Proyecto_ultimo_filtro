/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inmobiliaria.demo.dto;

import lombok.Data;

/**
 *
 * @author camper
 */
@Data
public class DtoInmueble {
    private Long id;
    
    private String estado;
    
    private String precio;
    
    private String numero_referencia;
}
