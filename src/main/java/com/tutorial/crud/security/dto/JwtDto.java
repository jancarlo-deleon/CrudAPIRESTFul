/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.crud.security.dto;

import lombok.*;

/**
 *
 * @author Jan Carlo
 */
@Getter
@Setter
@NoArgsConstructor
public class JwtDto {
    private String token;
    
    public JwtDto(String token){
        this.token = token;
    }
}
