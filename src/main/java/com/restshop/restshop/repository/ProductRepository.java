package com.restshop.restshop.repository;

import com.restshop.restshop.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByNombre(String lastName);

    Product findByIdProducto(long id);
}
