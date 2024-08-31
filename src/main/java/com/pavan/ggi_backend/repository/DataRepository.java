package com.pavan.ggi_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.ggi_backend.model.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, Long> {
}
