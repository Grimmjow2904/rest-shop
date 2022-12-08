package com.restshop.restshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venta")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVenta;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    Client id_cliente;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idVenta")
    private Set<DetailSale> ventas;


}