package com.inventory.exception;

public class SupplierNotFoundException extends RuntimeException {

    private final Long id;

    public SupplierNotFoundException(Long id) {
        super("supplier-not-found-" + id);
        this.id = id;
    }

    public Long getSupplierId() {
        return id;
    }
}