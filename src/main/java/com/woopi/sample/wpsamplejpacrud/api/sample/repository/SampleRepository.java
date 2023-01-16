package com.woopi.sample.wpsamplejpacrud.api.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.woopi.sample.wpsamplejpacrud.api.sample.entity.SampleEntity;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long>{

    
    
}
