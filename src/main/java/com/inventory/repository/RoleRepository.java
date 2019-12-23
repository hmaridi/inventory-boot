package com.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventory.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}