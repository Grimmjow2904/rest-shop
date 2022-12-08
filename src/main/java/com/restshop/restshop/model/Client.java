package com.restshop.restshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;

    private String nombre;

    private String apellido;

    private String dni;

    private String telefono;

    private String email;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id_cliente")
    private Set<Sale> ventas;


}