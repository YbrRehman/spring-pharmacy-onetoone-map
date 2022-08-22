package com.pharmacyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmacyapp.model.Pharmacy;
@Repository
public interface IPharmacyRepository extends JpaRepository<Pharmacy, Integer>{

}
