package com.stg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.restaurententity.Restaurent;
@Repository
public interface RestaurentRepository extends JpaRepository<Restaurent, Integer> {

}
