package com.lojavirtual.logistica.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String numero;

}
