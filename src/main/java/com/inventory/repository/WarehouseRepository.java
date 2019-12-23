package com.inventory.repository;

import io.swagger.annotations.ApiOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.inventory.model.Warehouse;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    List<?> findByName(@Param("name") String name);

    @ApiOperation(value = "Find the warehouses with a name containing certain keywords", notes = "Here I have some notes")
    List<?> findByNameContains(@Param("keyword") String keyword);

    @Override
    @RestResource(exported = false)
    void delete(Warehouse entity);

}
