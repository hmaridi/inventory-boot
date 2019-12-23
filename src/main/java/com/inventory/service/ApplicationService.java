package com.inventory.service;

import com.inventory.model.*;
import com.inventory.repository.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ApplicationService {

    private final Logger LOGGER = LoggerFactory.getLogger(ApplicationService.class);

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private WarehouseRepository warehouseRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ProductGroupRepository productGroupRepository;

    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
	private PasswordEncoder passwordEncoder;

    
    public User saveUser(User user){
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
    	
    }
}
