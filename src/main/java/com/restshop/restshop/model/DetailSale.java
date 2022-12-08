package com.restshop.restshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalleVenta")
public class DetailSale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDetalleVenta;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    Product idProducto;


    @ManyToOne
    @JoinColumn(name = "idVenta")
    Sale idVenta;

}