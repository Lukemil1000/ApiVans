package com.unip.ApiVans.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Van implements Serializable {

    private Long id;
    private String placa;
    private String modelo;
    private String cor;
    private String documento;
    private String qrcode;




}
