package com.restshop.restshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Data;


@Entity
@Builder
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;

    private String nombre;

    private Float precio;

    protected Product() {}

    public Product(Long idProducto, String nombre, Float precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio=precio;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%d, nombre='%s', precio='%s']",
                idProducto, nombre, precio);
    }
}
