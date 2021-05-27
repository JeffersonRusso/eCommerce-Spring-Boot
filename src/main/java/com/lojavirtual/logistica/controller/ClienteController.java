package com.lojavirtual.logistica.controller;

import com.lojavirtual.logistica.model.Cliente;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return null;
    }
}
