package com.inventory.repository;

import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.inventory.model.Product;
import com.inventory.model.ProductType;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @RestResource(path = "bycode")
    @ApiOperation(value = "Get products with code containing", notes = "")
    Page<Product> findByCodeContains(@Param("text") String text, Pageable pageable);

    @RestResource(path = "bytype")
    @ApiOperation(value = "Get products with type", notes = "")
    Page<Product> findByType(@Param("type") ProductType type, Pageable pageable);

    @RestResource(path = "bysupplier")
    @ApiOperation(value = "Get products by supplier", notes = "")
    Page<Product> findBySupplierId(@Param("supplier") Long id, Pageable pageable);

}