package com.stg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.customerentity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
