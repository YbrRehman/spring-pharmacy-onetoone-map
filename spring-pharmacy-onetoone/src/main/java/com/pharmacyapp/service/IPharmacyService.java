package com.pharmacyapp.service;

import com.pharmacyapp.model.Pharmacy;

public interface IPharmacyService {
	void addMedicine(Pharmacy pharmacy);
	void updateMedicine(Pharmacy pharmacy);
	void deleteMedicie(Pharmacy pharmacy);

}
