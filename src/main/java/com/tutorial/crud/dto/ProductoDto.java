/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Jan Carlo
 */
@Getter
@Setter
@NoArgsConstructor
public class ProductoDto {
    
    @NotBlank
    private String nombre;
    @Min(0)
    private Double precio;
    
    public ProductoDto(@NotBlank String nombre, @Min(0) Double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    
}
