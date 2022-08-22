package com.pharmacyapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pharmacy {
	@Id
	@GeneratedValue(generator ="pharm_seq",strategy =GenerationType.AUTO)
	@SequenceGenerator(name="pharm_gen",sequenceName = "pharm_sequence",initialValue = 100,allocationSize = 1)
	private Integer drugId;
	@Column(length=20)
	private String name;
	private String composition;
	private String size;
	@Enumerated(EnumType.STRING)
	private ConsumeType type;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="manufacture_id")
	private Manufacturer manufacture;
	public Pharmacy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pharmacy(String name, String composition, String size, ConsumeType type, Manufacturer manufacture) {
		super();
		this.name = name;
		this.composition = composition;
		this.size = size;
		this.type = type;
		this.manufacture = manufacture;
	}
	public Integer getDrugId() {
		return drugId;
	}
	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public ConsumeType getType() {
		return type;
	}
	public void setType(ConsumeType type) {
		this.type = type;
	}
	public Manufacturer getManufacture() {
		return manufacture;
	}
	public void setManufacture(Manufacturer manufacture) {
		this.manufacture = manufacture;
	}
	
	

}
