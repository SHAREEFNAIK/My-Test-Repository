package com.naik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naik.entity.PlanEntity;

public interface IPlanRepository extends JpaRepository<PlanEntity, Integer> {

}