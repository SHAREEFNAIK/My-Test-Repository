package com.naik.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JRTP_EDUCATION_ENTITY")
@Data
public class DcIncomeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer incomeId;
	
	
	private Integer caseNo;
	private Long empIncome;
	private Long propertyIncome;
	
}