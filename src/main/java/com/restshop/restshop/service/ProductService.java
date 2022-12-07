package com.restshop.restshop.service;

import com.restshop.restshop.controller.ProductController;
import com.restshop.restshop.dto.ProductRequest;
import com.restshop.restshop.dto.ProductResponse;
import com.restshop.restshop.model.Product;
import com.restshop.restshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private static final Logger log = LogManager.getLogger(ProductController.class);

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .nombre(productRequest.getNombre())
                .precio(productRequest.getPrecio())
                .build();

        productRepository.save(product);

        log.info("Producto "+product.getIdProducto()+" en base de datos");
    }

    public List<ProductResponse> getAllProducts() {

     List<Product> products = (List<Product>) productRepository.findAll();

     return products.stream().map(this::mapToProductResponse).toList();

    }

    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .idProducto(product.getIdProducto())
                .nombre(product.getNombre())
                .precio(product.getPrecio()).build();
    }
}
