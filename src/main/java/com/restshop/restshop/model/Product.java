package com.restshop.restshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;
    private String nombre;
    private Float precio;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "idProducto")
    private Set<DetailSale> detailSaleSet;

    @Override
    public String toString() {
        return String.format(
                "Product[id=%d, nombre='%s', precio='%s']",
                idProducto, nombre, precio);
    }
}
