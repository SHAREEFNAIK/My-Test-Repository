package com.naik.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JRTP_PLAN_CATEGORY")
@Data
public class CategoryEntity {
	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	@Column(name = "CATEGORY_NAME", length = 30)
	private String categoryName;
	@Column(name = "CATEGORY_DESCRIPTION", length = 30)
	private String categoryDescription;
	@Column(name = "ACTIVE_SW", length = 30)
	private String activeSw = "active";
	@Column(name = "CREATION_DATE", updatable = false)
	@CreationTimestamp()
	private LocalDateTime creationDate;
	@Column(name = "UPDATED_DATE", updatable = true, insertable = false)
	private LocalDateTime updatedDate;
	@Column(name="CREATED_BY", length = 30)
	private String createdBy;  
	@Column(name="UPDATED_BY", length = 30) 
    private String updatedBy;
	  
	  
	 
}